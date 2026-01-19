import java.io.*;

class P1 {
    public static void main(String ar[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // ---------------------- INPUT ASSEMBLY CODE ----------------------
        String a[][] = {
            {"", "START", "101", ""},
            {"", "MOVER", "BREG", "ONE"},
            {"AGAIN", "MULT", "BREG", "TERM"},
            {"", "MOVER", "CREG", "TERM"},
            {"", "ADD", "CREG", "N"},
            {"", "MOVEM", "CREG", "TERM"},
            {"N", "DS", "2", ""},
            {"RESULT", "DS", "2", ""},
            {"ONE", "DC", "1", ""},
            {"TERM", "DS", "1", ""},
            {"", "END", "", ""}
        };

        // ---------------------- INITIALIZATION ----------------------
        int lc = Integer.parseInt(a[0][2]); // Start address
        String st[][] = new String[10][2];  // Symbol Table
        int cnt = 0;

        // ---------------------- SYMBOL TABLE GENERATION ----------------------
        for (int i = 1; i < a.length; i++) {
            if (!a[i][0].equals("")) {
                st[cnt][0] = a[i][0];
                st[cnt][1] = Integer.toString(lc);
                cnt++;

                if (a[i][1].equalsIgnoreCase("DS")) {
                    int d = Integer.parseInt(a[i][2]);
                    lc = lc + d;
                } else {
                    lc++;
                }
            } else {
                lc++;
            }
        }

        // ---------------------- DISPLAY SYMBOL TABLE ----------------------
        System.out.println("\n********** SYMBOL TABLE **********");
        System.out.println("Symbol\tAddress");
        System.out.println("---------------------");
        for (int i = 0; i < cnt; i++) {
            System.out.println(st[i][0] + "\t" + st[i][1]);
        }

        // ---------------------- DEFINE INSTRUCTION & REGISTER TABLES ----------------------
        String inst[] = {
            "STOP", "ADD", "SUB", "MULT", "MOVER", "MOVEM",
            "COMP", "BC", "DIV", "READ", "PRINT"
        };
        String reg[] = {"NULL", "AREG", "BREG", "CREG", "DREG"};
        int op[][] = new int[20][3];  // MOT Table

        int cnt1 = 0, p = 1;

        // ---------------------- MACHINE OPCODE TABLE GENERATION ----------------------
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < inst.length; j++) {
                if (a[i][1].equalsIgnoreCase(inst[j])) {
                    op[cnt1][0] = j; // opcode index
                } else if (a[i][1].equalsIgnoreCase("DS")) {
                    p = Integer.parseInt(a[i][2]);
                } else if (a[i][1].equalsIgnoreCase("DC")) {
                    op[cnt1][2] = Integer.parseInt(a[i][2]);
                }
            }

            for (int k = 0; k < reg.length; k++) {
                if (a[i][2].equalsIgnoreCase(reg[k])) {
                    op[cnt1][1] = k; // register index
                }
            }

            for (int l = 0; l < cnt; l++) {
                if (a[i][3].equalsIgnoreCase(st[l][0])) {
                    int mn = Integer.parseInt(st[l][1]);
                    op[cnt1][2] = mn; // symbol address
                }
            }

            cnt1 = cnt1 + p;
        }

        // ---------------------- DISPLAY MACHINE OPCODE TABLE ----------------------
        System.out.println("\n********** MACHINE OPCODE TABLE (MOT) **********");
        System.out.println("Address\tOpcode\tReg\tMemory/Const");
        System.out.println("-------------------------------------");

        int dlc = Integer.parseInt(a[0][2]);
        for (int i = 0; i < 12; i++) {
            System.out.print(dlc++ + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(op[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n***** PROGRAM EXECUTED SUCCESSFULLY *****");
    }
}

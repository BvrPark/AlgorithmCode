package step7;

import java.util.Scanner;

public class Num9_2941 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        int count = 0;

        for (int i = 0; i < a.length(); i++) {

            char b = a.charAt(i);

            if(b == 'c') {
                if(i < a.length() - 1) {
                    if(a.charAt(i + 1) == '=') {
                        i++;
                    }
                    else if(a.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }

            else if(b == 'd') {
                if(i < a.length() - 1) {
                    if(a.charAt(i + 1) == 'z') {
                        if(i < a.length() - 2) {
                            if(a.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    }

                    else if(a.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }

            else if(b == 'l') {
                if(i < a.length() - 1) {
                    if(a.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }

            else if(b == 'n') {
                if(i < a.length() - 1) {
                    if(a.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }

            else if(b == 's') {
                if(i < a.length() - 1) {
                    if(a.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }

            else if(b == 'z') {
                if(i < a.length() - 1) {
                    if(a.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }

            count++;

        }

        System.out.println(count);
    }
}

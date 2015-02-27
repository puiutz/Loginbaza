/**
 * Created by puiutz on 26.02.2015.
 */
        import java.io.BufferedWriter;
        import java.io.File;
        import java.io.FileWriter;
        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

        public class User {
            public static void main(String[] args) {
                boolean isCorrect = false;

                do {
                    Scanner scaneaza = new Scanner(System.in);

                    System.out.println("Introdu primul nume");

                    // Declaram lista//
                    ArrayList List = new ArrayList();
                    List userList = new ArrayList();
                    String temp3 = scaneaza.nextLine();
                    User2 member = new User2();


                    member.setName(temp3);
                    member.getName();
                    System.out.println("Introdu parola:");
                    member.setPassword(temp3);

                    User2 member2 = new User2();
                    member2.setName(temp3);
                    member2.getName();

                    member2.setPassword(temp3);


                    // Adaugam elemente in lista//
                    List.add("Ionut");
                    List.add("Maria");
                    List.add("Coco");
                    List.add("Liviu");

                    // Parcurgem lista si ii afisam elementele//
                    for (int i = 0; i < List.size(); i++)
                        System.out.print(List.get(i) + "; ");

                    isCorrect = true;
                } while (!isCorrect);


                Runtime rs = Runtime.getRuntime();

                try {
                    rs.exec("notepad");
                } catch (IOException e) {
                    System.out.println(e);


                }
            }

            private void readFromFile() {
                try {


                    File file = new File("ancuta.txt");

                    // if file doesnt exists, then create it
                    if (!file.exists()) {
                        file.createNewFile();
                    }

                    String content = "Ionuta   "  + "  Parola " + "  Maria " +"  Alta parola ";
                    FileWriter fw = new FileWriter(file.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(content);
                    bw.close();

                    System.out.println("Done");

                } catch (IOException e) {
                    e.printStackTrace();
                }

                
                }
                        }

                    }








package Figures.View;

import geometricEntities.Quadrangle.Quadrangle;
import geometricEntities.Triangle.Triangle;

import java.util.Scanner;

public class View implements IView {

    Triangle[] triangleArray;
    Quadrangle[] quadrangleArray;

    @Override
    public void setTriangleArray(Triangle[] triangleArray) {
        this.triangleArray = triangleArray;
    }

    @Override
    public void setQuadrangleArray(Quadrangle[] quadrangleArray) {
        this.quadrangleArray = quadrangleArray;
    }

    @Override
    public void menu() {
        int menu, menu2, menu3, menu4 = -1;

        do {
            System.out.println("0 - wyjscie");
            System.out.println("1 - wyswietl opcje dla trojkatow");
            System.out.println("2 - wyswietl opcje dla czworokatow");
            System.out.println("3 - wyswietl dane wszystkich figur");

            menu = View.inputInt(0, 3);

            if(menu==1) {
                System.out.println("1 - pobierz wspolrzedne punktu");
                System.out.println("2 - wyswietl wysokosc danego trojkata z danego wierzcholka");
                System.out.println("3 - wyswietl dane o danym trojkacie");
                System.out.println("4 - wyswietl dane o wszystkich trojkatach");
                System.out.println("5 - zamien wierzcholek");
                System.out.println("6 - posortuj tablice");

                menu2 = View.inputInt(1, 6);

                if(menu2==1) {
                    System.out.println("W tablicy znajduje sie "+triangleArray.length+" trojkatow. ");
                    menu3 = View.inputInt(1, triangleArray.length);
                    menu3--;

                    System.out.println("1 - wierzcholek A");
                    System.out.println("2 - wierzcholek B");
                    System.out.println("3 - wierzcholek C");
                    menu4 = View.inputInt(1, 3);

                    if(menu4==1) System.out.println("Wierzcholek: "+triangleArray[menu3].getA().toString());
                    else if(menu4==2) System.out.println("Wierzcholek: "+triangleArray[menu3].getB().toString());
                    else if(menu4==3) System.out.println("Wierzcholek: "+triangleArray[menu3].getC().toString());
                }

                else if(menu2==2) {
                    System.out.println("W tablicy znajduje sie "+triangleArray.length+" trojkatow. ");
                    menu3 = View.inputInt(1, triangleArray.length);
                    menu3--;

                    System.out.println("1 - wierzcholek A");
                    System.out.println("2 - wierzcholek B");
                    System.out.println("3 - wierzcholek C");
                    menu4 = View.inputInt(1, 3);

                    if(menu4==1) System.out.println("Wysokosc z wierzcholka A: "+triangleArray[menu4].getHeight(triangleArray[menu4].getA()));
                    else if(menu4==2) System.out.println("Wysokosc z wierzcholka B: "+triangleArray[menu4].getHeight(triangleArray[menu4].getB()));
                    else if(menu4==3) System.out.println("Wysokosc z wierzcholka C: "+triangleArray[menu4].getHeight(triangleArray[menu4].getC()));
                }

                else if(menu2==3) {
                    System.out.println("W tablicy znajduje sie "+triangleArray.length+" trojkatow.");
                    menu3 = View.inputInt(1, triangleArray.length);
                    menu3--;

                    triangleArray[menu3].printData();
                }

                else if(menu2==4) Triangle.printAllData(triangleArray);

                else if(menu2==5) {
                    double newX, newY;
                    System.out.println("W tablicy znajduje sie "+triangleArray.length+" trojkatow.");
                    menu3 = View.inputInt(1, triangleArray.length);
                    menu3--;

                    System.out.println("1 - wierzcholek A");
                    System.out.println("2 - wierzcholek B");
                    System.out.println("3 - wierzcholek C");
                    menu4 = View.inputInt(1, 3);

                    if(menu4==1) {
                        System.out.println("Wybrano wierzcholek A do zmiany.");

                        System.out.print("Podaj nowa wspolrzedna x: ");
                        newX = inputDouble();

                        System.out.print("Podaj nowa wspolrzedna y: ");
                        newY = inputDouble();

                        triangleArray[menu3].changeA(newX, newY);
                    }

                    else if(menu4==2) {
                        System.out.println("Wybrano wierzcholek B do zmiany.");

                        System.out.print("Podaj nowa wspolrzedna x: ");
                        newX = inputDouble();

                        System.out.print("Podaj nowa wspolrzedna y: ");
                        newY = inputDouble();

                        triangleArray[menu3].changeB(newX, newY);
                    }

                    else if(menu4==3) {
                        System.out.println("Wybrano wierzcholek C do zmiany.");

                        System.out.print("Podaj nowa wspolrzedna x: ");
                        newX = inputDouble();

                        System.out.print("Podaj nowa wspolrzedna y: ");
                        newY = inputDouble();

                        triangleArray[menu3].changeC(newX, newY);
                    }
                }

                else if(menu2==6) {
                    Triangle.sortArray(triangleArray);
                    System.out.println("Posortowano tablice rosnaco po polach.");
                }
            }

            else if(menu==2) {
                System.out.println("1 - pobierz wspolrzedne punktu");
                System.out.println("2 - wyswietl dana przekatna");
                System.out.println("3 - wyswietl dane o danym czworokacie");
                System.out.println("4 - wyswietl dane o wszystkich czworokatach");
                System.out.println("5 - zamien wierzcholek");
                System.out.println("6 - posortuj tablice");

                menu2 = View.inputInt(1, 6);

                if(menu2==1) {
                    System.out.println("W tablicy znajduje sie "+quadrangleArray.length+" czworokatow. ");
                    menu3 = View.inputInt(1, quadrangleArray.length);
                    menu3--;

                    System.out.println("1 - wierzcholek A");
                    System.out.println("2 - wierzcholek B");
                    System.out.println("3 - wierzcholek C");
                    System.out.println("4 - wierzcholek D");
                    menu4 = View.inputInt(1, 4);

                    if(menu4==1) System.out.println("Wierzcholek: "+quadrangleArray[menu3].getA().toString());
                    else if(menu4==2) System.out.println("Wierzcholek: "+quadrangleArray[menu3].getB().toString());
                    else if(menu4==3) System.out.println("Wierzcholek: "+quadrangleArray[menu3].getC().toString());
                    else if(menu4==4) System.out.println("Wierzcholek: "+quadrangleArray[menu3].getD().toString());
                }

                else if(menu2==2) {
                    System.out.println("W tablicy znajduje sie "+quadrangleArray.length+" czworokatow. ");
                    menu3 = View.inputInt(1, quadrangleArray.length);
                    menu3--;

                    System.out.println("1 - przekatna AC");
                    System.out.println("2 - przekatna BD");
                    menu4 = View.inputInt(1, 2);

                    if(menu4==1) System.out.println("Dlugosc przekatnej: "+quadrangleArray[menu3].getDiagonalAC());
                    else if(menu4==2) System.out.println("Dlugosc przekatnej: "+quadrangleArray[menu3].getDiagonalBD());
                }

                else if(menu2==3) {
                    System.out.println("W tablicy znajduje sie "+quadrangleArray.length+" czworokatow.");
                    menu3 = View.inputInt(1, quadrangleArray.length);
                    menu3--;

                    quadrangleArray[menu3].printData();
                }

                else if(menu2==4) Quadrangle.printAllData(quadrangleArray);

                else if(menu2==5) {
                    double newX, newY;
                    System.out.println("W tablicy znajduje sie "+quadrangleArray.length+" czworokatow.");
                    menu3 = View.inputInt(1, quadrangleArray.length);
                    menu3--;

                    System.out.println("1 - wierzcholek A");
                    System.out.println("2 - wierzcholek B");
                    System.out.println("3 - wierzcholek C");
                    System.out.println("4 - wierzcholek D");
                    menu4 = View.inputInt(1, 4);

                    if(menu4==1) {
                        System.out.println("Wybrano wierzcholek A do zmiany.");

                        System.out.print("Podaj nowa wspolrzedna x: ");
                        newX = inputDouble();

                        System.out.print("Podaj nowa wspolrzedna y: ");
                        newY = inputDouble();

                        quadrangleArray[menu3].changeA(newX, newY);
                    }

                    else if(menu4==2) {
                        System.out.println("Wybrano wierzcholek B do zmiany.");

                        System.out.print("Podaj nowa wspolrzedna x: ");
                        newX = inputDouble();

                        System.out.print("Podaj nowa wspolrzedna y: ");
                        newY = inputDouble();

                        quadrangleArray[menu3].changeB(newX, newY);
                    }

                    else if(menu4==3) {
                        System.out.println("Wybrano wierzcholek C do zmiany.");

                        System.out.print("Podaj nowa wspolrzedna x: ");
                        newX = inputDouble();

                        System.out.print("Podaj nowa wspolrzedna y: ");
                        newY = inputDouble();

                        quadrangleArray[menu3].changeC(newX, newY);
                    }

                    else if(menu4==4) {
                        System.out.println("Wybrano wierzcholek D do zmiany.");

                        System.out.print("Podaj nowa wspolrzedna x: ");
                        newX = inputDouble();

                        System.out.print("Podaj nowa wspolrzedna y: ");
                        newY = inputDouble();

                        quadrangleArray[menu3].changeD(newX, newY);
                    }
                }

                else if(menu2==6) {
                    Quadrangle.sortArray(quadrangleArray);
                    System.out.println("Posortowano tablice rosnaco po polach.");
                }
            }

            else if(menu==3) {
                System.out.println("CZWOROKATY: ");
                Quadrangle.printAllData(quadrangleArray);

                System.out.println("TROJKATY: ");
                Triangle.printAllData(triangleArray);
            }

        } while(menu != 0);

        System.out.println("Konczenie dzialania programu.");
    }

    public static int inputInt(int from, int to) {
        Scanner sc = new Scanner(System.in);
        int menu = -1;
        String input;

        do {
            System.out.print("Wprowadz opcje: ");
            input = sc.next();
            try {
                menu = Integer.parseInt(input);

                if(menu<from || menu>to) throw new NumberFormatException();
            }

            catch (NumberFormatException ex) {
                System.out.println("Podano zla opcje, sprobuj ponownie.");
            }
        } while (menu<from || menu>to);

        return menu;
    }

    public static double inputDouble() {
        Scanner sc = new Scanner(System.in);
        double value = 0;
        String input;

        input = sc.next();

        try {
            value = Double.parseDouble(input);
        }

        catch (NumberFormatException ex) {
            System.out.println("Nie podano liczby, sprobuj ponownie.");
        }

        return value;
    }
}
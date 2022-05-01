import java.io.*;
class mygame{

    private String arr[] = new String [9]; // For the nine boxes of Tic Tac Toe game
    private char choice; // To store the choice of user
    private String name; // To store the name in case of single player game
    private String name1; // To store the name of first player in case of multiplayer
    private String name2; // To store the name of second player in case of multiplayer
    private int x; // To store the first position entered by the user
    private int c; // To store the number of steps
    private int count = 0;

    private void getData() throws Throwable{ // To take the choice of user
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter your choice : ");
        choice=(char)br.read();
    } // End of getData()

    private int user_input() throws Throwable{ // To take the position of the box where the user wants to put an X
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter the position of the box where you want to put an X : ");
        return Integer.parseInt(br.readLine());
    } // End of user_input()

    private int user_input1() throws Throwable{ // To prompt the user to enter the position of a box which is empty
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter the position of another box where you want to put an X : ");
        return Integer.parseInt(br.readLine());
    } // End of user_input1()

    private int user_input2() throws Throwable{ // To take the position of the box where the second user wants to put an O in case of multiplayer
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter the position of the box where you want to put an O : ");
        return Integer.parseInt(br.readLine());
    } // End of user_input2()

    private int user_input3() throws Throwable{ //To prompt the second user to enter the position of a box which is empty
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter the position of another box where you want to put an O : ");
        return Integer.parseInt(br.readLine());
    } // End of user_input3()

    private void username() throws Throwable{ // To store the name of the user in single player game
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter your name : ");
        name = br.readLine();
    } // End of username()

    private void username1() throws Throwable{ //To store the name of first player in multiplayer game
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println();
        System.out.print("Enter first player's name : ");
        name1 = br.readLine();
    } // End of username1()

    private void username2() throws Throwable{ //To store the name of second player in multiplayer game
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter second player's name : ");
        name2 = br.readLine();
    } // End of username2()

    private int com_position(int a){ // To prevent the user from winning
        if ((arr[0].equals(arr[1])) && (arr[2].equals("   ")) && (arr[0].equals(" X ")))
            a = 2;
        else if ((arr[0].equals(arr[2])) && (arr[1].equals("   ")) && (arr[0].equals(" X ")))
            a = 1;
        else if ((arr[1].equals(arr[2])) && (arr[0].equals("   ")) && (arr[1].equals(" X ")))
            a = 0;
        else if ((arr[3].equals(arr[4])) && (arr[5].equals("   ")) && (arr[3].equals(" X ")))
            a = 5;
        else if ((arr[3].equals(arr[5])) && (arr[4].equals("   ")) && (arr[3].equals(" X ")))
            a = 4;
        else if ((arr[4].equals(arr[5])) && (arr[3].equals("   ")) && (arr[4].equals(" X ")))
            a = 3;
        else if ((arr[6].equals(arr[7])) && (arr[8].equals("   ")) && (arr[6].equals(" X ")))
            a = 8;
        else if ((arr[6].equals(arr[8])) && (arr[7].equals("   ")) && (arr[6].equals(" X ")))
            a = 7;
        else if ((arr[8].equals(arr[7])) && (arr[6].equals("   ")) && (arr[7].equals(" X ")))
            a = 6;
        else if ((arr[0].equals(arr[3])) && (arr[6].equals("   ")) && (arr[0].equals(" X ")))
            a = 6;
        else if ((arr[0].equals(arr[6])) && (arr[3].equals("   ")) && (arr[0].equals(" X ")))
            a = 3;
        else if ((arr[3].equals(arr[6])) && (arr[0].equals("   ")) && (arr[3].equals(" X ")))
            a = 0;
        else if ((arr[1].equals(arr[4])) && (arr[7].equals("   ")) && (arr[1].equals(" X ")))
            a = 7;
        else if ((arr[1].equals(arr[7])) && (arr[4].equals("   ")) && (arr[1].equals(" X ")))
            a = 4;
        else if ((arr[4].equals(arr[7])) && (arr[1].equals("   ")) && (arr[4].equals(" X ")))
            a = 1;
        else if ((arr[2].equals(arr[5])) && (arr[8].equals("   ")) && (arr[2].equals(" X ")))
            a = 8;
        else if ((arr[2].equals(arr[8])) && (arr[5].equals("   ")) && (arr[2].equals(" X ")))
            a = 5;
        else if ((arr[5].equals(arr[8])) && (arr[2].equals("   ")) && (arr[5].equals(" X ")))
            a = 2;
        else if ((arr[0].equals(arr[4])) && (arr[8].equals("   ")) && (arr[0].equals(" X ")))
            a = 8;
        else if ((arr[0].equals(arr[8])) && (arr[4].equals("   ")) && (arr[0].equals(" X ")))
            a = 4;
        else if ((arr[4].equals(arr[8])) && (arr[0].equals("   ")) && (arr[4].equals(" X ")))
            a = 0;
        else if ((arr[2].equals(arr[4])) && (arr[6].equals("   ")) && (arr[2].equals(" X ")))
            a = 6;
        else if ((arr[2].equals(arr[6])) && (arr[4].equals("   ")) && (arr[2].equals(" X ")))
            a = 4;
        else if ((arr[4].equals(arr[6])) && (arr[2].equals("   ")) && (arr[4].equals(" X ")))
            a = 2;
        else
            return a;
        return a;
    } // End of com_position()

    private int correct_position(int a){ // For the computer to win
        if ((arr[0].equals(arr[1])) && (arr[2].equals("   ")) && (arr[0].equals(" O ")))
            a = 2;
        else if ((arr[0].equals(arr[2])) && (arr[1].equals("   ")) && (arr[0].equals(" O ")))
            a = 1;
        else if ((arr[1].equals(arr[2])) && (arr[0].equals("   ")) && (arr[1].equals(" O ")))
            a = 0;
        else if ((arr[3].equals(arr[4])) && (arr[5].equals("   ")) && (arr[3].equals(" O ")))
            a = 5;
        else if ((arr[3].equals(arr[5])) && (arr[4].equals("   ")) && (arr[3].equals(" O ")))
            a = 4;
        else if ((arr[4].equals(arr[5])) && (arr[3].equals("   ")) && (arr[4].equals(" O ")))
            a = 3;
        else if ((arr[6].equals(arr[7])) && (arr[8].equals("   ")) && (arr[6].equals(" O ")))
            a = 8;
        else if ((arr[6].equals(arr[8])) && (arr[7].equals("   ")) && (arr[6].equals(" O ")))
            a = 7;
        else if ((arr[8].equals(arr[7])) && (arr[6].equals("   ")) && (arr[7].equals(" O ")))
            a = 6;
        else if ((arr[0].equals(arr[3])) && (arr[6].equals("   ")) && (arr[0].equals(" O ")))
            a = 6;
        else if ((arr[0].equals(arr[6])) && (arr[3].equals("   ")) && (arr[0].equals(" O ")))
            a = 3;
        else if ((arr[3].equals(arr[6])) && (arr[0].equals("   ")) && (arr[3].equals(" O ")))
            a = 0;
        else if ((arr[1].equals(arr[4])) && (arr[7].equals("   ")) && (arr[1].equals(" O ")))
            a = 7;
        else if ((arr[1].equals(arr[7])) && (arr[4].equals("   ")) && (arr[1].equals(" O ")))
            a = 4;
        else if ((arr[4].equals(arr[7])) && (arr[1].equals("   ")) && (arr[4].equals(" O ")))
            a = 1;
        else if ((arr[2].equals(arr[5])) && (arr[8].equals("   ")) && (arr[2].equals(" O ")))
            a = 8;
        else if ((arr[2].equals(arr[8])) && (arr[5].equals("   ")) && (arr[2].equals(" O ")))
            a = 5;
        else if ((arr[5].equals(arr[8])) && (arr[2].equals("   ")) && (arr[5].equals(" O ")))
            a = 2;
        else if ((arr[0].equals(arr[4])) && (arr[8].equals("   ")) && (arr[0].equals(" O ")))
            a = 8;
        else if ((arr[0].equals(arr[8])) && (arr[4].equals("   ")) && (arr[0].equals(" O ")))
            a = 4;
        else if ((arr[4].equals(arr[8])) && (arr[0].equals("   ")) && (arr[4].equals(" O ")))
            a = 0;
        else if ((arr[2].equals(arr[4])) && (arr[6].equals("   ")) && (arr[2].equals(" O ")))
            a = 6;
        else if ((arr[2].equals(arr[6])) && (arr[4].equals("   ")) && (arr[2].equals(" O ")))
            a = 4;
        else if ((arr[4].equals(arr[6])) && (arr[2].equals("   "))&&(arr[4].equals(" O ")))
            a = 2;
        else
            return a;
        return a;
    } // End of correct_position()

    private int stop_intelligency(int a){ // For preventing the user from making the computer fall into trap

        if ((x == 4) && (c == 1))
            while(true) {
                if ((a == 0) || (a == 2) || (a == 6) || (a == 8))
                    return a;
                else
                    a =(int)Math.floor(Math.random()*9);
            }

        else if ((x == 4) && (c == 3) && ((arr[0].equals(" X ")) || (arr[2].equals(" X ")) || (arr[6].equals(" X ")) || (arr[8].equals(" X "))))
            while(true) {
                if (((a == 0) || (a == 2) || (a == 6) || (a == 8)) && (arr[a].equals("   ")))
                    return a;
                else
                    a =(int)Math.floor(Math.random()*9);
            }

        else if (((x == 1) || (x == 3) || (x == 5) || (x == 7) || (x == 0) || (x == 2) || (x == 6) || (x == 8)) && (c == 1)) {
            a = 4;
            return a;
        }

        else if(((x == 1) || (x == 7)) && ((arr[3].equals(" O ")) || (arr[5].equals(" O "))) && (c == 5))
            while(true) {
                if(((a == 0 || a == 6) && (arr[3].equals(" O "))) || ((a == 2 || a == 8) && (arr[5].equals(" O "))))
                    return a;
                else
                    a =(int)Math.floor(Math.random()*9);
            }

        else if(((x == 3) || (x == 5)) && ((arr[1].equals(" O ")) || (arr[7].equals(" O "))) && (c == 5))
            while(true) {
                if(((a == 8 || a == 6) && (arr[7].equals(" O "))) || ((a == 2 || a == 0) && (arr[1].equals(" O "))))
                    return a;
                else
                    a =(int)Math.floor(Math.random()*9);
            }

        else if ((arr[4].equals(" O ")) && (c == 3) && ((arr[0].equals(arr[8])) || (arr[2].equals(arr[6]))))
            while(true) {
                if (a == 1 || a == 3 || a == 5 || a == 7)
                    return a;
                else
                    a =(int)Math.floor(Math.random()*9);
            }

        else
            return a;

    } // End of stop_intelligency()
    public void show() throws Throwable{ // To work out the whole game
        int u ; int i ;
        while(true) {
            for(i = 0 ; i < 9 ; i++)
                arr[i] = "   ";
            System.out.println();
            System.out.println("Enter S or s for Single Player ");
            System.out.println("Enter M or m for Multiplayer");
            System.out.println("Enter X or x to quit or terminate the program");
            System.out.println();
            getData();
            switch (choice) {

                case 'S', 's' -> {
                    System.out.println();
                    System.out.println("Choose the level of difficulty :");
                    System.out.println("Enter B or b for Beginner");
                    System.out.println("Enter M or m for Mediocre");
                    System.out.println("Enter I or i for Impossible");
                    System.out.println();
                    getData();
                    System.out.println();

                    switch (choice) {
                        case 'B', 'b' -> {
                            c = 0;
                            username();
                            while (true) {
                                c++;
                                System.out.println();
                                u = user_input() - 1;
                                while (!arr[u].equals("   ")) {
                                    System.out.println("Box already filled with :" + arr[u]);
                                    u = user_input1() - 1;
                                    System.out.println();
                                }
                                arr[u] = " X ";

                                if (((arr[0].equals(arr[1])) && (arr[1].equals(arr[2])) && (arr[0].equals(" X "))) || ((arr[3].equals(arr[4])) && (arr[4].equals(arr[5])) && (arr[3].equals(" X "))) || ((arr[6].equals(arr[7])) && (arr[7].equals(arr[8])) && (arr[6].equals(" X "))) || ((arr[1].equals(arr[4])) && (arr[1].equals(arr[7])) && (arr[1].equals(" X "))) || ((arr[2].equals(arr[5])) && (arr[2].equals(arr[8])) && (arr[2].equals(" X "))) || ((arr[0].equals(arr[3])) && (arr[0].equals(arr[6])) && (arr[0].equals(" X "))) || ((arr[0].equals(arr[4])) && (arr[0].equals(arr[8])) && (arr[0].equals(" X "))) || ((arr[2].equals(arr[4])) && (arr[2].equals(arr[6])) && (arr[2].equals(" X ")))) {
                                    System.out.println();
                                    display();
                                    System.out.println();
                                    System.out.println(name + " defeated computer");
                                    break;
                                }

                                if (c == 9) {
                                    System.out.println();
                                    display();
                                    System.out.println();
                                    System.out.println("Match tied");
                                    System.out.println();
                                    System.out.println("Do you want to play again ?");
                                    break;
                                }
                                int rand = (int) Math.floor(Math.random() * 9);
                                while (!arr[rand].equals("   "))
                                    rand = (int) Math.floor(Math.random() * 9);
                                arr[rand] = " O ";
                                c++;
                                System.out.println();
                                display();

                                if (((arr[0].equals(arr[1])) && (arr[1].equals(arr[2])) && (arr[0].equals(" O "))) || ((arr[3].equals(arr[4])) && (arr[4].equals(arr[5])) && (arr[3].equals(" O "))) || ((arr[6].equals(arr[7])) && (arr[7].equals(arr[8])) && (arr[6].equals(" O "))) || ((arr[1].equals(arr[4])) && (arr[1].equals(arr[7])) && (arr[1].equals(" O "))) || ((arr[2].equals(arr[5])) && (arr[2].equals(arr[8])) && (arr[2].equals(" O "))) || ((arr[0].equals(arr[3])) && (arr[0].equals(arr[6])) && (arr[0].equals(" O "))) || ((arr[0].equals(arr[4])) && (arr[0].equals(arr[8])) && (arr[0].equals(" O "))) || ((arr[2].equals(arr[4])) && (arr[2].equals(arr[6])) && (arr[2].equals(" O ")))) {
                                    System.out.println();
                                    System.out.println("Computer defeated " + name);
                                    break;
                                }

                            }
                        } // End of case N or n

                        case 'M', 'm' -> {
                            c = 0;
                            username();
                            while (true) {
                                c++;
                                System.out.println();
                                u = user_input() - 1;
                                while (!arr[u].equals("   ")) {
                                    System.out.println("Box already filled with :" + arr[u]);
                                    u = user_input1() - 1;
                                    System.out.println();
                                }
                                arr[u] = " X ";

                                if (((arr[0].equals(arr[1])) && (arr[1].equals(arr[2])) && (arr[0].equals(" X "))) || ((arr[3].equals(arr[4])) && (arr[4].equals(arr[5])) && (arr[3].equals(" X "))) || ((arr[6].equals(arr[7])) && (arr[7].equals(arr[8])) && (arr[6].equals(" X "))) || ((arr[1].equals(arr[4])) && (arr[1].equals(arr[7])) && (arr[1].equals(" X "))) || ((arr[2].equals(arr[5])) && (arr[2].equals(arr[8])) && (arr[2].equals(" X "))) || ((arr[0].equals(arr[3])) && (arr[0].equals(arr[6])) && (arr[0].equals(" X "))) || ((arr[0].equals(arr[4])) && (arr[0].equals(arr[8])) && (arr[0].equals(" X "))) || ((arr[2].equals(arr[4])) && (arr[2].equals(arr[6])) && (arr[2].equals(" X ")))) {
                                    System.out.println();
                                    display();
                                    System.out.println();
                                    System.out.println(name + " defeated computer");
                                    break;
                                }

                                if (c == 9) {
                                    System.out.println();
                                    display();
                                    System.out.println();
                                    System.out.println("Match tied");
                                    System.out.println();
                                    System.out.println("Do you want to play again ?");
                                    break;
                                }
                                int rand = (int) Math.floor(Math.random() * 9);
                                while (!arr[rand].equals("   "))
                                    rand = (int) Math.floor(Math.random() * 9);
                                rand = com_position(rand);
                                rand = correct_position(rand);
                                arr[rand] = " O ";
                                c++;
                                System.out.println();
                                display();

                                if (((arr[0].equals(arr[1])) && (arr[1].equals(arr[2])) && (arr[0].equals(" O "))) || ((arr[3].equals(arr[4])) && (arr[4].equals(arr[5])) && (arr[3].equals(" O "))) || ((arr[6].equals(arr[7])) && (arr[7].equals(arr[8])) && (arr[6].equals(" O "))) || ((arr[1].equals(arr[4])) && (arr[1].equals(arr[7])) && (arr[1].equals(" O "))) || ((arr[2].equals(arr[5])) && (arr[2].equals(arr[8])) && (arr[2].equals(" O "))) || ((arr[0].equals(arr[3])) && (arr[0].equals(arr[6])) && (arr[0].equals(" O "))) || ((arr[0].equals(arr[4])) && (arr[0].equals(arr[8])) && (arr[0].equals(" O "))) || ((arr[2].equals(arr[4])) && (arr[2].equals(arr[6])) && (arr[2].equals(" O ")))) {
                                    System.out.println();
                                    System.out.println("Computer defeated " + name);
                                    break;
                                }

                            }
                        } // End of case B or b

                        case 'I', 'i' -> {
                            c = 0;
                            username();
                            while (true) {
                                c++;
                                System.out.println();
                                u = user_input() - 1;
                                if (c == 1)
                                    x = u;
                                while (!arr[u].equals("   ")) {
                                    System.out.println("Box already filled with :" + arr[u]);
                                    u = user_input1() - 1;
                                    System.out.println();
                                }
                                arr[u] = " X ";

                                if (((arr[0].equals(arr[1])) && (arr[1].equals(arr[2])) && (arr[0].equals(" X "))) || ((arr[3].equals(arr[4])) && (arr[4].equals(arr[5])) && (arr[3].equals(" X "))) || ((arr[6].equals(arr[7])) && (arr[7].equals(arr[8])) && (arr[6].equals(" X "))) || ((arr[1].equals(arr[4])) && (arr[1].equals(arr[7])) && (arr[1].equals(" X "))) || ((arr[2].equals(arr[5])) && (arr[2].equals(arr[8])) && (arr[2].equals(" X "))) || ((arr[0].equals(arr[3])) && (arr[0].equals(arr[6])) && (arr[0].equals(" X "))) || ((arr[0].equals(arr[4])) && (arr[0].equals(arr[8])) && (arr[0].equals(" X "))) || ((arr[2].equals(arr[4])) && (arr[2].equals(arr[6])) && (arr[2].equals(" X ")))) {
                                    System.out.println();
                                    display();
                                    System.out.println();
                                    System.out.println(name + " defeated computer");
                                    break;
                                }

                                if (c == 9) {
                                    System.out.println();
                                    display();
                                    System.out.println();
                                    System.out.println("Match tied");
                                    System.out.println();
                                    System.out.println("Do you want to play again ?");
                                    break;
                                }
                                int rand = (int) Math.floor(Math.random() * 9);
                                while (!arr[rand].equals("   "))
                                    rand = (int) Math.floor(Math.random() * 9);
                                rand = stop_intelligency(rand);
                                rand = com_position(rand);
                                rand = correct_position(rand);
                                arr[rand] = " O ";
                                c++;
                                System.out.println();
                                display();

                                if (((arr[0].equals(arr[1])) && (arr[1].equals(arr[2])) && (arr[0].equals(" O "))) || ((arr[3].equals(arr[4])) && (arr[4].equals(arr[5])) && (arr[3].equals(" O "))) || ((arr[6].equals(arr[7])) && (arr[7].equals(arr[8])) && (arr[6].equals(" O "))) || ((arr[1].equals(arr[4])) && (arr[1].equals(arr[7])) && (arr[1].equals(" O "))) || ((arr[2].equals(arr[5])) && (arr[2].equals(arr[8])) && (arr[2].equals(" O "))) || ((arr[0].equals(arr[3])) && (arr[0].equals(arr[6])) && (arr[0].equals(" O "))) || ((arr[0].equals(arr[4])) && (arr[0].equals(arr[8])) && (arr[0].equals(" O "))) || ((arr[2].equals(arr[4])) && (arr[2].equals(arr[6])) && (arr[2].equals(" O ")))) {
                                    System.out.println();
                                    System.out.println("Computer defeated " + name);
                                    break;
                                }

                            }
                        } // End of case M or m

                        default -> System.out.println("Wrong Input");
                    } // End of case switch case in case S or s
                } // End of case S or s

                case 'M', 'm' -> {
                    if (count > 0) {
                        count++;
                        System.out.println("Do you want to change the name of players");
                        System.out.println("Enter Y or y for yes");
                        System.out.println("Enter N or n for no");
                        getData();
                        if (choice == 'y' || choice == 'Y') {
                            username1();
                            username2();
                        }
                    }
                    if (count == 0) {
                        username1();
                        username2();
                    }
                    c = 0;
                    while (true) {
                        c++;
                        System.out.println();
                        System.out.println(name1 + "'s turn");
                        u = user_input() - 1;
                        System.out.println();
                        while (!arr[u].equals("   ")) {
                            System.out.println("Box already filled with :" + arr[u]);
                            u = user_input1() - 1;
                            System.out.println();
                        }
                        arr[u] = " X ";
                        display();
                        if (((arr[0].equals(arr[1])) && (arr[1].equals(arr[2])) && (arr[0].equals(" X "))) || ((arr[3].equals(arr[4])) && (arr[4].equals(arr[5])) && (arr[3].equals(" X "))) || ((arr[6].equals(arr[7])) && (arr[7].equals(arr[8])) && (arr[6].equals(" X "))) || ((arr[1].equals(arr[4])) && (arr[1].equals(arr[7])) && (arr[1].equals(" X "))) || ((arr[2].equals(arr[5])) && (arr[2].equals(arr[8])) && (arr[2].equals(" X "))) || ((arr[0].equals(arr[3])) && (arr[0].equals(arr[6])) && (arr[0].equals(" X "))) || ((arr[0].equals(arr[4])) && (arr[0].equals(arr[8])) && (arr[0].equals(" X "))) || ((arr[2].equals(arr[4])) && (arr[2].equals(arr[6])) && (arr[2].equals(" X ")))) {
                            System.out.println();
                            System.out.println(name1 + " defeated " + name2);
                            break;
                        }

                        if (c == 9) {
                            System.out.println();
                            display();
                            System.out.println("Match tied");
                            System.out.println();
                            System.out.println("Do you want to play again ?");
                            break;
                        }
                        System.out.println();
                        c++;
                        System.out.println(name2 + "'s turn");
                        u = user_input2() - 1;
                        System.out.println();
                        while (!arr[u].equals("   ")) {
                            System.out.println("Box already filled with :" + arr[u]);
                            u = user_input3() - 1;
                            System.out.println();
                        }
                        arr[u] = " O ";
                        display();


                        if (((arr[0].equals(arr[1])) && (arr[1].equals(arr[2])) && (arr[0].equals(" O "))) || ((arr[3].equals(arr[4])) && (arr[4].equals(arr[5])) && (arr[3].equals(" O "))) || ((arr[6].equals(arr[7])) && (arr[7].equals(arr[8])) && (arr[6].equals(" O "))) || ((arr[1].equals(arr[4])) && (arr[1].equals(arr[7])) && (arr[1].equals(" O "))) || ((arr[2].equals(arr[5])) && (arr[2].equals(arr[8])) && (arr[2].equals(" O "))) || ((arr[0].equals(arr[3])) && (arr[0].equals(arr[6])) && (arr[0].equals(" O "))) || ((arr[0].equals(arr[4])) && (arr[0].equals(arr[8])) && (arr[0].equals(" O "))) || ((arr[2].equals(arr[4])) && (arr[2].equals(arr[6])) && (arr[2].equals(" O ")))) {
                            System.out.println();
                            System.out.println(name2 + " defeated " + name1);
                            break;
                        }

                    }
                } // End of case m or M for Multiplayer

                case 'X', 'x' -> {
                    System.out.println();
                    System.out.println("Program terminated");
                    return;
                }
                default -> System.out.println("Wrong Input");
            } // End of main case switch case
        } // End of main while loop
    } // End of show()

    private void display(){ // To print the Tic Tac Toe box after every input
        System.out.println( arr[0]+ " | " +arr[1] +" | "+ arr[2]  );
        System.out.println("----------------");
        System.out.println( arr[3]+ " | " +arr[4] +" | "+ arr[5]  );
        System.out.println("----------------");
        System.out.println( arr[6]+ " | " +arr[7] +" | "+ arr[8] );
    } // End of display()
} // End of class mygame

public class TicTacToe { // Main Class
    public static void main(String[] args) throws Throwable { // Main Method
        System.out.println("\nWelcome to Supantha's Tic Tac Toe Game");
        System.out.println("The position of the boxes of Tic Tac Toe are in the following order :");
        System.out.println();
        System.out.println("1 | 2 | 3  ");
        System.out.println("-----------");
        System.out.println("4 | 5 | 6  ");
        System.out.println("-----------");
        System.out.println("7 | 8 | 9 ");
        mygame ob = new mygame();
        ob.show();
    } // End of Main Method
} // End of Main Class

//package workSpace;
//
//import java.util.NoSuchElementException;
//import java.util.Scanner;
//public class Nokia_3310_Phone {
//        private static final PhoneBook phoneBook = new PhoneBook();
//        private static final MenuOption[] SetInput1 = MenuOption.values();
//        private static final Scanner input = new Scanner(System.in);
//
//        public static void displayMainMenu() {
//            String message = """
//                    -> NOKIA 3310
//                    -> Press 1 for PHONEBOOK Menu
//                    -> Press 2 for MESSAGES Menu
//                    -> Press 3 for CHAT
//                    -> Press 4 for CALL REGISTER
//                    -> Press 5 for TONES Menu
//                    -> Press 6 for SETTINGS
//                    -> Press 7 for CALL DIVERT
//                    -> Press 8 for GAMES
//                    -> Press 9 for CALCULATOR
//                    -> Press 10 for REMINDERS
//                    -> Press 11 for CLOCK Menu
//                    -> Press 12 for PROFILE
//                    -> Press 13 for SIM SERVICES
//                    -> Press 0 to SWITCH OFF
//                """;
//            System.out.print(message);
//            MenuOption SetInput1 = getRequest();
//
//            while (SetInput1 != MenuOption.TURN_OFF){
//                switch (SetInput1){
//                    case PHONE_BOOK:{
//                        Object PhoneBook;
//                        phoneBook.displayPhoneBookMenu();
//                        break;
//                    }
//
//                    case MESSAGES: {
//                        Messages.displayMessagesMenu();
//                        break;
//                    }
//
//                    case CHAT:{
//                        System.out.println("Now in chat");
//                        System.out.println("Search for who to chat with: ");
//                        break;
//                    }
//
//                    case CALL_REGISTER:{
//                        CallRegister.displayCallRegisterMenu();
//                        getRequest();
//                        break;
//                    }
//
//                    case TONES:{
//                        message = """
//                                -> Press 1 to set RINGING TONE
//                                -> Press 2 to set RINGING VOLUME
//                                -> Press 3 to set INCOMING CALL ALERT
//                                -> Press 4 to view COMPOSER
//                                -> Press 5 to set MESSAGE ALERT TONE
//                                -> Press 6 to set KEYPAD TONES
//                                -> Press 7 to set WARNING AND GAME TONES
//                                -> Press 8 to set VIBRATING ALERT
//                                -> Press 9 to set SCREEN SAVER
//                                -> Press 0 to return to PREVIOUS MENU
//                            """;
//                        System.out.println(message);
//                        getRequest();
//                        break;
//                    }
//
//                    case SETTINGS:{
//                        message = """
//                                    -> Press 1 for CALL SETTINGS
//                                    -> Press 2 for PHONE SETTINGS
//                                    -> Press 3 for SECURITY SETTINGS
//                                    -> Press 4 to RESTORE FACTORY SETTINGS
//                                    -> Press 0 to return to PREVIOUS MENU
//                                """;
//                        System.out.println(message);
//                        getRequest();
//                        break;
//                    }
//
//                    case CALL_DIVERT:{
//                        System.out.println("Input Number to divert calls to");
//                        break;
//                    }
//
//                    case GAMES:{
//                        System.out.println("Select games to play");
//                        break;
//                    }
//
//                    case CALCULATOR:{
//                        System.out.println("Welcome to calculator ");
//                        break;
//                    }
//
//                    case REMINDERS:{
//                        System.out.println("Set reminder");
//                        break;
//                    }
//
//                    case CLOCK:{
//                        message = """
//                                -> Press 1 to set ALARM CLOCK
//                                -> Press 2 for CLOCK SETTINGS
//                                -> Press 3 for DATE SETTING
//                                -> Press 4 to set STOPWATCH
//                                -> Press 5 to set COUNTDOWN TIMER
//                                -> Press 6 to set AUTO UPDATE OF DATE AND TIME
//                                -> Press 0 to return to PREVIOUS MENU
//                            """;
//                        System.out.println(message);
//                        getRequest();
//                        break;
//                    }
//
//                    case PROFILES:{
//                        System.out.println("display Profiles");
//                        break;
//                    }
//
//                    case SIM_SERVICES:{
//                        System.out.println("display sim services");
//                        break;
//                    }
//
//                    default:{
//                        System.exit(-1);
//                    }
//                }
//                System.out.println(message);
//                SetInput1 = getRequest();
//            }
//            if (SetInput1 == MenuOption.TURN_OFF){
//                System.exit(0);
//            }
//        }
//
//        private static MenuOption getRequest() {
//            int request = 0;
//            try{
//                do{
//                    System.out.print("Waiting for input: ");
//                    request = input.nextInt();
//                }while (request < 0 || request > 13);
//                if (request == 0){
//                    System.out.println("Switching off...");
//                    return SetInput1[13];
//                }
//            }
//            catch (NoSuchElementException noSuchElementException){
//                System.err.println("Invalid Input, Terminating....");
//                System.exit(-1);
//            }
//            catch (NullPointerException nullPointerException){
//                System.out.println("No Input entered, Terminating...");
//                System.exit(-1);
//            }
//            return SetInput1[request - 1];
//        }
//
//    public static class PhoneBook {
//        public void displayPhoneBookMenu() {
//        }
//    }
//}
//
//    enum MenuOption{
//        PHONE_BOOK(1),
//        MESSAGES(2),
//        CHAT(3),
//        CALL_REGISTER(4),
//        TONES(5),
//        SETTINGS(6),
//        CALL_DIVERT(7),
//        GAMES(8),
//        CALCULATOR(9),
//        REMINDERS(10),
//        CLOCK(11),
//        PROFILES(12),
//        SIM_SERVICES(13),
//        TURN_OFF(0);
//
//        private final int option;
//
//        public int getOption() {
//            return option;
//        }
//
//        MenuOption(int option){
//            this.option = option;
//        }
//    }
//}

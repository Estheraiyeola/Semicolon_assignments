package tdd;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void sIMServices() {
        System.out.print("""
                ====================================
                        SIM services
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) menu();
        else {
            System.out.println("Invalid option.");
            sIMServices();
        }
    }

    public static void profiles() {
        System.out.print("""
                ====================================
                        Profiles
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) menu();
        else {
            System.out.println("Invalid option.");
            profiles();
        }
    }

    public static void clock() {
        System.out.print("""
                ====================================
                            Clock
                ====================================
                1. Alarm clock
                2. Clock settings
                3. Date setting
                4. Stopwatch
                5. Countdown timer
                6. Auto update of date and time
                7. Back
                """);
        String userOption = input.next();
        switch (userOption){
            case "1" -> alarmClock();
            case "2"-> clockSettings();
            case "3"-> dateSetting();
            case "4" -> stopwatch();
            case "5"-> countdownTimer();
            case "6" -> autoUpdateOfDateAndTime();
            case "7" -> menu();
            default -> {
                System.out.println("Invalid option");
                clock();
            }
        }
    }

    public static void autoUpdateOfDateAndTime() {
        System.out.print("""
                =======================================
                      Auto update of date and time
                =======================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) clock();
        else {
            System.out.println("Invalid option.");
            autoUpdateOfDateAndTime();
        }
    }

    public static void countdownTimer() {
        System.out.print("""
                ====================================
                           Countdown timer
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) clock();
        else {
            System.out.println("Invalid option.");
            countdownTimer();
        }
    }

    public static void stopwatch() {
        System.out.print("""
                ====================================
                            Stopwatch
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) clock();
        else {
            System.out.println("Invalid option.");
            stopwatch();
        }
    }

    public static void dateSetting() {
        System.out.print("""
                ====================================
                            Date settings
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) clock();
        else {
            System.out.println("Invalid option.");
            dateSetting();
        }
    }

    public static void clockSettings() {
        System.out.print("""
                ====================================
                            Clock settings
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) clock();
        else {
            System.out.println("Invalid option.");
            clockSettings();
        }
    }

    public static void alarmClock() {
        System.out.print("""
                ====================================
                            Alarm clock
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) clock();
        else {
            System.out.println("Invalid option.");
            alarmClock();
        }
    }

    public static void reminders() {
        System.out.print("""
                ====================================
                            Reminders
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) menu();
        else {
            System.out.println("Invalid option.");
            reminders();
        }
    }

    public static void calculator() {
        System.out.print("""
                ====================================
                            Calculator
                ====================================
                1. Input a number
                2. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) calculate();
        else if (Objects.equals(userOption, "2")) {
            menu();
        } else {
            System.out.println("Invalid option.");
            calculator();
        }
    }
    public static void calculate(){
        System.out.print("");

        int firstNumber = input.nextInt();
        String operator = input.next();
        int secondNumber = input.nextInt();

        int total = 0;
        if (Objects.equals(operator, "+")) {
            total = firstNumber + secondNumber;
        }

        else if (Objects.equals(operator, "-")) {
            total = firstNumber - secondNumber;
        }

        else if (Objects.equals(operator, "/")) {
            total = firstNumber /secondNumber;
        }
        else if (Objects.equals(operator, "*")) {
            total = firstNumber * secondNumber;
        }
        else calculate();
        System.out.println(total);
        calculator();
    }

    public static void games() {
        System.out.print("""
                ====================================
                            Games
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) menu();
        else {
            System.out.println("Invalid option.");
            games();
        }
    }

    public static void callDivert() {
        System.out.print("""
                ====================================
                        Call divert
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) menu();
        else {
            System.out.println("Invalid option.");
            callDivert();
        }
    }

    public static void settings() {
        System.out.print("""
                =================================
                            Settings
                =================================
                1. Call settings
                2. Phone settings
                3. Security settings
                4. Restore factory settings
                5. Back
                """);
        String userOutput = input.next();
        switch (userOutput){
            case "1" -> callSettings();
            case "2" -> phoneSettings();
            case "3" -> securitySettings();
            case "4" -> restoreFactorySettings();
            case "5" -> menu();
            default -> {
                System.out.println("Invalid option.");
                settings();
            }
        }
    }

    public static void restoreFactorySettings() {
        System.out.print("""
                ====================================
                       Restore factory settings
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) settings();
        else {
            System.out.println("Invalid option.");
            restoreFactorySettings();
        }
    }

    public static void securitySettings() {
        System.out.print("""
                ==================================
                        Security settings
                ==================================
                1. PIN code request
                2. Call barring service
                3. Fixed dialling
                4. Closed user group
                5. Phone security
                6. Change access codes
                7. Back
                """);
        String userOption = input.next();
        switch (userOption){
            case "1" -> pinCodeRequest();
            case "2" -> callBarringService();
            case "3" -> fixedDialling();
            case "4" -> closedUserGroup();
            case "5" -> phoneSecurity();
            case "6" -> changeAccessCodes();
            case "7" -> settings();
            default -> {
                System.out.println("Invalid option");
                securitySettings();
            }
        }
    }

    public static void changeAccessCodes() {
        System.out.print("""
                ====================================
                        Change access codes
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) securitySettings();
        else {
            System.out.println("Invalid option.");
            changeAccessCodes();
        }
    }

    public static void phoneSecurity() {
        System.out.print("""
                ====================================
                        Phone security
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) securitySettings();
        else {
            System.out.println("Invalid option.");
            phoneSecurity();
        }
    }

    public static void closedUserGroup() {
        System.out.print("""
                ====================================
                        Closed user group
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) securitySettings();
        else {
            System.out.println("Invalid option.");
            closedUserGroup();
        }
    }

    public static void fixedDialling() {
        System.out.print("""
                ====================================
                        Fixed dialling
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) securitySettings();
        else {
            System.out.println("Invalid option.");
            fixedDialling();
        }
    }

    public static void callBarringService() {
        System.out.print("""
                ====================================
                        Call barring service
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) securitySettings();
        else {
            System.out.println("Invalid option.");
            callBarringService();
        }
    }

    public static void pinCodeRequest() {
        System.out.print("""
                ====================================
                        PIN code request
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) securitySettings();
        else {
            System.out.println("Invalid option.");
            pinCodeRequest();
        }
    }

    public static void phoneSettings() {
        System.out.print("""
                =====================================
                        Phone settings
                =====================================
                1. Language
                2. Cell info display
                3. Welcome note
                4. Network selection
                5. Lights
                6. Confirm SIM service actions
                7. Back
                """);
        String userOption = input.next();
        switch (userOption){
            case "1" -> language();
            case "2" -> cellInfoDisplay();
            case "3" -> welcomeNote();
            case "4" -> networkSelection();
            case "5" -> lights();
            case "6" -> confirmSimServiceActions();
            case "7" -> settings();
            default -> {
                System.out.println("Invalid option.");
                phoneSettings();
            }
        }
    }

    public static void confirmSimServiceActions() {
        System.out.print("""
                ====================================
                    Confirm SIM service actions
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) phoneSettings();
        else {
            System.out.println("Invalid option.");
            confirmSimServiceActions();
        }
    }

    public static void lights() {
        System.out.print("""
                ================================
                            Lights
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) phoneSettings();
        else {
            System.out.println("Invalid option.");
            lights();
        }
    }

    public static void networkSelection() {
        System.out.print("""
                ================================
                        Network selection
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) phoneSettings();
        else {
            System.out.println("Invalid option.");
            networkSelection();
        }
    }

    public static void welcomeNote() {
        System.out.print("""
                ================================
                        Welcome note
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) phoneSettings();
        else {
            System.out.println("Invalid option.");
            welcomeNote();
        }
    }

    public static void cellInfoDisplay() {
        System.out.print("""
                ================================
                        Cell info display
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) phoneSettings();
        else {
            System.out.println("Invalid option.");
            cellInfoDisplay();
        }
    }

    public static void language() {
        System.out.print("""
                ================================
                            Language
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) phoneSettings();
        else {
            System.out.println("Invalid option.");
            language();
        }
    }

    public static void callSettings() {
        System.out.print("""
                ======================================
                         Call settings
                ======================================
                1. Automatic redial
                2. Speed dialling
                3. Call waiting options
                4. Own number sending
                5. Phone line in use
                6. Automatic answer
                7. Back
                """);
        int userOption = input.nextInt();
        switch (userOption){
            case 1 -> automaticRedial();
            case 2 -> speedDialling();
            case 3 -> callWaitingOptions();
            case 4 -> ownNumberSending();
            case 5 -> phoneLineInUse();
            case 6 -> automaticAnswer();
            case 7 -> settings();
            default -> {
                System.out.println("Invalid option.");
                callSettings();
            }
        }
    }

    public static void automaticAnswer() {
        System.out.print("""
                ================================
                        Automatic answer
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) callSettings();
        else {
            System.out.println("Invalid option.");
            automaticAnswer();
        }
    }

    public static void phoneLineInUse() {
        System.out.print("""
                ================================
                        Phone line in use
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) callSettings();
        else {
            System.out.println("Invalid option.");
            phoneLineInUse();
        }
    }

    public static void ownNumberSending() {
        System.out.print("""
                ================================
                        Own number sending
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) callSettings();
        else {
            System.out.println("Invalid option.");
            ownNumberSending();
        }
    }

    public static void callWaitingOptions() {
        System.out.print("""
                ================================
                        Call waiting options
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) callSettings();
        else {
            System.out.println("Invalid option.");
            callWaitingOptions();
        }
    }

    public static void speedDialling() {
        System.out.print("""
                ================================
                        Speed dialling
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) callSettings();
        else {
            System.out.println("Invalid option.");
            speedDials();
        }
    }

    public static void automaticRedial() {
        System.out.print("""
                ================================
                        Automatic redial
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) callSettings();
        else {
            System.out.println("Invalid option.");
            automaticRedial();
        }
    }

    public static void tones() {
        System.out.print("""
                ===================================
                            Tones
                ===================================
                1. Ringing tone
                2. Ringing volume
                3. Incoming call alert
                4. Composer
                5. Message alert tone
                6. Keypad tones
                7. Warming and game tones
                8. Vibrating alert
                9. Screen saver
                10. Back
                """);
        String userOption = input.next();
        switch (userOption){
            case "1" -> ringingTone();
            case "2" -> ringingVolume();
            case "3" -> incomingCallAlert();
            case "4" -> composer();
            case "5" -> messageAlertTone();
            case "6" -> keypadTones();
            case "7" -> warningAndGameTones();
            case "8" -> vibratingAlert();
            case "9" -> screenSaver();
            case "10" -> menu();
            default -> {
                System.out.println("Invalid option.");
                tones();
            }
        }
    }

    public static void screenSaver() {
        System.out.print("""
                ================================
                        Screen saver
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) tones();
        else {
            System.out.println("Invalid option.");
            screenSaver();
        }
    }

    public static void vibratingAlert() {
        System.out.print("""
                ================================
                        Vibrating alert
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) tones();
        else {
            System.out.println("Invalid option.");
            vibratingAlert();
        }
    }

    public static void warningAndGameTones() {
        System.out.print("""
                ================================
                    Warning and game tones
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) tones();
        else {
            System.out.println("Invalid option.");
            warningAndGameTones();
        }
    }

    public static void keypadTones() {
        System.out.print("""
                ================================
                           Keypad tones
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) tones();
        else {
            System.out.println("Invalid option.");
            keypadTones();
        }
    }

    public static void messageAlertTone() {
        System.out.print("""
                ================================
                    Message alert tone
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) tones();
        else {
            System.out.println("Invalid option.");
            messageAlertTone();
        }
    }

    public static void composer() {
        System.out.print("""
                ================================
                            Composer
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) tones();
        else {
            System.out.println("Invalid option.");
            composer();
        }
    }

    public static void incomingCallAlert() {
        System.out.print("""
                ================================
                        Incoming call alert
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) tones();
        else {
            System.out.println("Invalid option.");
            incomingCallAlert();
        }
    }

    public static void ringingVolume() {
        System.out.print("""
                =====================
                    Ringing volume
                =====================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) tones();
        else {
            System.out.println("Invalid option.");
            ringingVolume();
        }
    }

    public static void ringingTone() {
        System.out.print("""
                =====================
                    Ringing tone
                =====================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) tones();
        else {
            System.out.println("Invalid option.");
            ringingTone();
        }
    }

    public static void callRegister() {
        System.out.print("""
                ============================
                        Call register
                ============================
                1. Missed calls
                2. Received calls
                3. Dialled numbers
                4. Erase recent calls
                5. Show call duration
                6. Show call costs
                7. Call cost settings
                8. Prepaid credit
                9. Back
                """);
        String userOption = input.next();
        switch (userOption){
            case "1" -> missedCalls();
            case "2" -> receivedCalls();
            case "3" -> dialledNumbers();
            case "4" -> eraseRecentCalls();
            case "5" -> showCallDuration();
            case "6" -> showCallCosts();
            case "7" -> callCostSettings();
            case "8" -> prepaidCredit();
            case "9" -> menu();
            default -> {
                System.out.println("Invalid option.");
                callRegister();
            }
        }
    }

    public static void prepaidCredit() {
        System.out.print("""
                =====================
                    Prepaid credit
                =====================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) callRegister();
        else {
            System.out.println("Invalid option.");
            prepaidCredit();
        }
    }

    public static void callCostSettings() {
        System.out.print("""
                =====================================
                        Call cost settings
                =====================================
                1. Call cost limit
                2. Show costs in
                3. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) callCostLimit();
        else if (Objects.equals(userOption, "2")) showCostsIn();
        else if (Objects.equals(userOption, "3")) callRegister();
        else {
            System.out.println("Invalid option.");
            callCostSettings();
        }
    }

    public static void showCostsIn() {
        System.out.print("""
                ================================
                        Show costs in
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) callCostSettings();
        else {
            System.out.println("Invalid option.");
            showCostsIn();
        }
    }

    public static void callCostLimit() {
        System.out.print("""
                ================================
                        Call cost limit
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) callCostSettings();
        else {
            System.out.println("Invalid option.");
            callCostLimit();
        }
    }

    public static void showCallCosts() {
        System.out.print("""
                ==================================
                        Show call costs
                ==================================
                1. Last call cost
                2. All calls' cost
                3. Clear counters
                4. Back
                """);
        String userOption = input.next();
        switch (userOption){
            case "1" -> lastCallCost();
            case "2" -> allCallsCost();
            case "3" -> clearCounters();
            case "4" -> callRegister();
            default -> {
                System.out.println("Invalid option.");
                showCallCosts();
            }
        }
    }

    public static void clearCounters() {
        System.out.print("""
                ================================
                        Clear counters
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) showCallCosts();
        else {
            System.out.println("Invalid option.");
            clearCounters();
        }
    }

    public static void allCallsCost() {
        System.out.print("""
                ================================
                        All calls' cost
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) showCallCosts();
        else {
            System.out.println("Invalid option.");
            allCallsCost();
        }
    }

    public static void lastCallCost() {
        System.out.print("""
                ================================
                        Last call cost
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) showCallCosts();
        else {
            System.out.println("Invalid option.");
            lastCallCost();
        }
    }

    public static void showCallDuration() {
        System.out.print("""
                ====================================
                        Show call duration
                ====================================
                1. Last call duration
                2. All calls' duration
                3. Received calls' duration
                4. Dialled calls' duration
                5. Clear timers
                6. Back
                """);
        String userOption = input.next();
        switch (userOption){
            case "1" -> lastCallDuration();
            case "2" -> allCallsDuration();
            case "3" -> receivedCallsDuration();
            case "4" -> dialledCallsDuration();
            case "5" -> clearTimers();
            case "6" -> callRegister();
            default -> {
                System.out.println("Invalid option.");
                showCallDuration();
            }
        }
    }

    public static void clearTimers() {
        System.out.print("""
                ================================
                        Clear timers
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) showCallDuration();
        else {
            System.out.println("Invalid option.");
            clearTimers();
        }
    }

    public static void dialledCallsDuration() {
        System.out.print("""
                ===================================
                        Dialled calls' duration
                ===================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) showCallDuration();
        else {
            System.out.println("Invalid option.");
            dialledCallsDuration();
        }
    }

    public static void receivedCallsDuration() {
        System.out.print("""
                ====================================
                        Received calls' duration
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) showCallDuration();
        else {
            System.out.println("Invalid option.");
            receivedCallsDuration();
        }
    }

    public static void allCallsDuration() {
        System.out.print("""
                ================================
                        All calls' duration
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) showCallDuration();
        else {
            System.out.println("Invalid option.");
            allCallsDuration();
        }
    }

    public static void lastCallDuration() {
        System.out.print("""
                ================================
                        Last call duration
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) showCallDuration();
        else {
            System.out.println("Invalid option.");
            lastCallDuration();
        }
    }

    public static void eraseRecentCalls() {
        System.out.print("""
                ================================
                        Erase recent calls
                ================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) callRegister();
        else {
            System.out.println("Invalid option.");
            eraseRecentCalls();
        }
    }

    public static void dialledNumbers() {
        System.out.print("""
                =====================
                    Dialled numbers
                =====================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) callRegister();
        else {
            System.out.println("Invalid option.");
            dialledNumbers();
        }
    }

    public static void receivedCalls() {
        System.out.print("""
                =====================
                    Received calls
                =====================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) callRegister();
        else {
            System.out.println("Invalid option.");
            receivedCalls();
        }
    }

    public static void missedCalls() {
        System.out.print("""
                ===================
                    Missed calls
                ===================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) callRegister();
        else {
            System.out.println("Invalid option.");
            missedCalls();
        }
    }

    public static void chat() {
        System.out.print("""
                ===================
                        Chat
                ===================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) menu();
        else {
            System.out.println("Invalid option.");
            chat();
        }
    }

    public static void messages() {
        System.out.println("""
                ===========================
                        MESSAGES
                ===========================
                1. Write messages
                2. Inbox
                3. Outbox
                4. Picture messages
                5. Templates
                6. Smileys
                7. Message settings
                8. Info service
                9. Voice mailbox number
                10. Service command editor
                11. Back
                """);
        String userOption = input.next();
        switch (userOption){
            case "1" -> writeMessages();
            case "2" -> inbox();
            case "3" -> outbox();
            case "4" -> pictureMessages();
            case "5" -> templates();
            case "6" -> smileys();
            case "7" -> messageSettings();
            case "8" -> infoService();
            case "9" -> voiceMailboxNumber();
            case "10" -> serviceCommandEditor();
            case "11" -> menu();
            default -> {
                System.out.println("Invalid option");
                messages();
            }
        }
    }

    public static void serviceCommandEditor() {
        System.out.print("""
                ===================================
                       Service command editor
                ===================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) messages();
        else {
            System.out.println("Invalid option");
            serviceCommandEditor();
        }
    }

    public static void voiceMailboxNumber() {
        System.out.print("""
                =====================================
                        Voice mailbox number
                =====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) messages();
        else {
            System.out.println("Invalid option");
            voiceMailboxNumber();
        }
    }

    public static void infoService() {
        System.out.print("""
                ==================================
                        Info service
                ==================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) messages();
        else {
            System.out.println("Invalid option");
            infoService();
        }
    }

    private static void messageSettings() {
        System.out.print("""
                ===========================
                        Message Settings
                ===========================
                1. Set
                2. Common
                3. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) set();
        else if (Objects.equals(userOption, "2")) common();
        else if (Objects.equals(userOption, "3")) messages();
        else {
            System.out.println("Invalid option.");
            messageSettings();
        }
    }

    public static void common() {
        System.out.print("""
                ==========================
                        Common
                ==========================
                1. Delivery reports
                2. Reply via same centre
                3. Character support
                4. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) deliveryReports();
        else if (Objects.equals(userOption, "2")) replyViaSameCentre();
        else if (Objects.equals(userOption, "3")) characterSupport();
        else if (Objects.equals(userOption, "4")) messageSettings();
        else {
            System.out.println("Invalid option");
            common();
        }
    }

    public static void characterSupport() {
        System.out.print("""
                ===========================
                   Character support
                ===========================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) common();
        else {
            System.out.println("Invalid option");
            characterSupport();
        }
    }

    public static void replyViaSameCentre() {
        System.out.print("""
                ===========================
                   Reply via same centre
                ===========================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) common();
        else {
            System.out.println("Invalid option");
            replyViaSameCentre();
        }
    }

    public static void deliveryReports() {
        System.out.print("""
                ===========================
                    Delivery reports
                ===========================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) common();
        else {
            System.out.println("Invalid option");
            deliveryReports();
        }
    }

    public static void set() {
        System.out.print("""
                =================
                    Set
                =================
                1. Message centre number
                2. Message sent as
                3. Message validity
                4. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) messageCentreNumber();
        else if (Objects.equals(userOption, "2")) messageSentAs();
        else if (Objects.equals(userOption, "3")) messageValidity();
        else if (Objects.equals(userOption, "4")) messageSettings();
        else {
            System.out.println("Invalid option");
            set();
        }

    }

    public static void messageValidity() {
        System.out.print("""
                ===========================
                    Message Validity
                ===========================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) set();
        else {
            System.out.println("Invalid option");
            messageValidity();
        }
    }

    public static void messageSentAs() {
        System.out.print("""
                =========================
                    Message sent as
                =========================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) set();
        else {
            System.out.println("Invalid option");
            messageSentAs();
        }
    }

    public static void messageCentreNumber() {
        System.out.print("""
                ===============================
                    Message centre number
                ===============================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) set();
        else {
            System.out.println("Invalid option");
            messageCentreNumber();
        }
    }

    public static void smileys() {
        System.out.print("""
                ==================================
                            Smileys
                ==================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) messages();
        else {
            System.out.println("Invalid option");
            smileys();
        }
    }

    public static void templates() {
        System.out.print("""
                ===============================
                            Templates
                ===============================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) messages();
        else {
            System.out.println("Invalid option");
            templates();
        }
    }

    public static void pictureMessages() {
        System.out.print("""
                ===============================
                        Picture messages
                ===============================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) messages();
        else {
            System.out.println("Invalid option");
            pictureMessages();
        }
    }

    public static void outbox() {
        System.out.print("""
                ===============================
                            Outbox
                ===============================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) messages();
        else {
            System.out.println("Invalid option");
            outbox();
        }
    }

    public static void inbox() {
        System.out.print("""
                =============================
                            Inbox
                =============================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) messages();
        else {
            System.out.println("Invalid option");
            inbox();
        }
    }

    public static void writeMessages() {
        System.out.print("""
                ===============================
                        Write messages
                ===============================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) messages();
        else {
            System.out.println("Invalid option");
            writeMessages();
        }
    }

    public static void phoneBook() {
        System.out.print("""
                ============================
                       PHONE BOOK
                ============================
                1. Search
                2. Service Nos
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b'card
                8. Options
                9. Speed dials
                10. Voice tags
                11. Back
                """);
        String userOption = input.next();

        switch (userOption){
            case "1" -> search();
            case "2" -> serviceNos();
            case "3" -> addName();
            case "4" -> erase();
            case "5" -> edit();
            case "6" -> assignTone();
            case "7" -> sendBcard();
            case "8" -> options();
            case "9" -> speedDials();
            case "10" -> voiceTags();
            case "11" -> menu();
            default -> {
                System.out.println("Invalid option.");
                phoneBook();
            }
        }
    }

    public static void menu() {
        mainMenu();
    }

    public static void mainMenu() {
        System.out.print("""
                ========================
                        MENU FUNCTIONS
                ========================
                1. Phone book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                --> select an option to proceed....
                """);
        String userOption = input.next();

        if (Objects.equals(userOption, "1")) phoneBook();
        else if (Objects.equals(userOption, "2")) messages();
        else if (Objects.equals(userOption, "3")) chat();
        else if (Objects.equals(userOption, "4")) callRegister();
        else if (Objects.equals(userOption, "5")) tones();
        else if (Objects.equals(userOption, "6")) settings();
        else if (Objects.equals(userOption, "7")) callDivert();
        else if (Objects.equals(userOption, "8")) games();
        else if (Objects.equals(userOption, "9")) calculator();
        else if (Objects.equals(userOption, "10")) reminders();
        else if (Objects.equals(userOption, "11")) clock();
        else if (Objects.equals(userOption, "12")) profiles();
        else if (Objects.equals(userOption, "13")) sIMServices();
        else {
            System.out.println("Invalid option." +
                    "   select a valid option to proceed");
            mainMenu();
        }

    }

    public static void voiceTags() {
        System.out.print("""
                ===================================
                        Voice tags
                ===================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) phoneBook();
        else {
            System.out.println("Invalid option");
            voiceTags();
        }
    }

    public static void speedDials() {
        System.out.print("""
                ===================================
                            Speed dials
                ===================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) phoneBook();
        else {
            System.out.println("Invalid option");
            speedDials();
        }
    }

    public static void options() {
        System.out.print("""
                ========================
                        Options
                ========================
                1. Type of view
                2. Memory status
                3. Back
                """);
        String userOption = input.next();
        switch (userOption){
            case "1" -> typeOfView();
            case "2" -> memoryStatus();
            case "3" -> phoneBook();
            default -> {
                System.out.println("Invalid option.");
                options();
            }
        }

    }

    public static void memoryStatus() {
        System.out.print("""
                ==============================
                        Memory status
                ==============================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) options();
        else {
            System.out.println("Invalid option");
            memoryStatus();
        }
    }

    public static void typeOfView() {
        System.out.print("""
                ==============================
                        Type of views
                ==============================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) options();
        else {
            System.out.println("Invalid option");
            typeOfView();
        }
    }

    public static void sendBcard() {
        System.out.print("""
                ==================================
                        Send b'card
                ==================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) phoneBook();
        else {
            System.out.println("Invalid option");
            sendBcard();
        }
    }

    public static void assignTone() {
        System.out.print("""
                ====================================
                            Assign tone
                ====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) phoneBook();
        else {
            System.out.println("Invalid option");
            assignTone();
        }
    }

    public static void edit() {
        System.out.print("""
                =====================================
                                Edit
                =====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) phoneBook();
        else {
            System.out.println("Invalid option");
            edit();
        }
    }

    public static void erase() {
        System.out.print("""
                ==================================
                                Erase
                ==================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) phoneBook();
        else {
            System.out.println("Invalid option");
            erase();
        }
    }

    public static void addName() {
        System.out.print("""
                =====================================
                            Add name
                =====================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) phoneBook();
        else {
            System.out.println("Invalid option");
            addName();
        }
    }

    public static void serviceNos() {
        System.out.print("""
                =========================================
                               Service Nos
                =========================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) phoneBook();
        else {
            System.out.println("Invalid option");
            serviceNos();
        }
    }

    public static void search() {
        System.out.print("""
                ==================================
                            Search
                ==================================
                1. Back
                """);
        String userOption = input.next();
        if (Objects.equals(userOption, "1")) phoneBook();
        else {
            System.out.println("Invalid option");
            search();
        }
    }


}

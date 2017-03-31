package WaveSoftProgram;

/**
 * Created by piotr on 26.03.17.
 */
public interface MenuTextOption {

    // FaultDiagnosis constans
    String FIRST_OPTION = "Katalog awarii - wciśnij 1";
    String SECOND_OPTION = "Identyfikacja awarii - wciśnij 2";
    String THIRD_OPTION = "Powrót - wciśnij 3";
    String FOURTH_OPTION = "zakończ program - wciśnij 4";
    String INSTRUCTION = "Co wybierasz?";
    String ERROR = "BŁĄÐ! Spróbuj jeszcze raz";
    String BACK_TO_MAIN_MENU = "Wyjdź do głównego menu - wciśnij 3";
    String EXIT = "zakończ program - wciśnij 4";

    // DaultCatalogMenu constans
    String INNER_MENU_FIRST_OPTION = "Wyświetl wszystkie awarie - wciśnij 1";
    String INNER_MENU_SECOND_OPTION = "Wybierz awarię - wciśnij 2";

    // searchCertainFault()
    String CHOSEN_FAULT = "WYBRANA AWARIA:";
    String FAULT_NAME = "NAZWA AWARII: ";
    String FAULT_DESCRIPTION = "OPIS AWARII: ";
    String NEEDED_PART = "POTRZEBNA CZĘŚĆ: ";
    String SEARCHING_QUESTION = "Wpisz nazwę awarii, której szukasz";
    String ERROR_INPUT = "BŁĄÐ! Nie ma takiej awari. Spróbuj jeszcze raz.";
}

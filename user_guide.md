## Instrukcja Obsługi Systemu Rejestracji Pojazdów
**Autor:** Maciej Zawada
**Klasa:** 3E


## Spis Treści
1. [Wymagania Systemowe](#1-wymagania-systemowe)
2. [Szybki Start](#2-szybki-start)
3. [Opis Funkcji Menu](#3-opis-funkcji-menu)
4. [Walidacja Danych](#4-walidacja-danych)
5. [Procedury Serwisowe](#5-procedury-serwisowe)


## 1. Wymagania Systemowe
Do uruchomienia aplikacji niezbędne jest:
* Zainstalowane środowisko Java (JDK/JRE) w wersji 11 lub wyższej.
* Dowolny emulator terminala (np. CMD, PowerShell, Bash).

## 2. Szybki Start
1. Otwórz terminal w folderze z projektem.
2. Skompiluj program: `javac *.java`.
3. Uruchom program: `java Main`.

## 3. Opis Funkcji Menu
Po uruchomieniu użytkownik ma do wyboru 6 opcji:
- **1-3 (Dodawanie):** Rejestracja nowego pojazdu (Lądowy, Powietrzny, Wodny).
- **4 (Lista):** Wyświetla wszystkie pojazdy w bazie wraz z ich unikalnymi parametrami.
- **5 (Serwis):** Wykonuje symulację przeglądu technicznego dla każdego elementu w rejestrze.
- **0 (Wyjście):** Zamyka aplikację i czyści pamięć podręczną.

## 4. Walidacja Danych
System dba o spójność bazy danych poprzez mechanizmy kontrolne:
* **Weryfikacja VIN:** Program nie przyjmie numeru VIN, który nie ma dokładnie **17 znaków**. W przypadku błędu zostaniesz poproszony o ponowne wpisanie.
* **Typy Danych:** Pola techniczne (przebieg, godziny) akceptują tylko liczby. Wprowadzenie liter spowoduje wyświetlenie komunikatu "Input Error".
## 4.1. Format daty rejestracji
Przy dodawaniu nowego pojazdu system poprosi o podanie daty rejestracji:
* **Format ręczny:** Należy wpisać datę w formacie `RRRR-MM-DD` (np. `2024-05-15`).
* **Automatyczne uzupełnienie:** Pozostawienie pola pustego i naciśnięcie klawisza `Enter` spowoduje automatyczne przypisanie **dzisiejszej daty**.

## 5. Procedury Serwisowe
Wybierając opcję **5**, system automatycznie dopasowuje rodzaj serwisu do pojazdu:
- Pojazdy lądowe: Service: Sir, this will work out, sir.
- Pojazdy powietrzne: Service: he will fly like lightning.
- Pojazdy wodne: ervice: Replacing the rear drive propeller (XDDDD).


*Dokument przygotowany na potrzeby projektu szkolnego.*

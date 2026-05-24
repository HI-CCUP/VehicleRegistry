## Vehicle Registration System User Manual
**Author:** HICCUP  


## Table of Contents
1. [System Requirements](#1-system-requirements)
2. [Quick Start](#2-quick-start)
3. [Menu Functions Description](#3-menu-functions-description)
4. [Data Validation](#4-data-validation)
5. [Service Procedures](#5-service-procedures)


## 1. System Requirements
To run the application, the following are required:
* Java environment (JDK/JRE) version 11 or higher installed.
* Any terminal emulator (e.g., CMD, PowerShell, Bash).

## 2. Quick Start
1. Open the terminal in the project folder.
2. Compile the program: `javac *.java`.
3. Run the program: `java Main`.

## 3. Menu Functions Description
After launching the application, the user has access to 6 options:
- **1-3 (Adding Vehicles):** Register a new vehicle (Land, Air, Water).
- **4 (List):** Displays all vehicles in the database along with their unique parameters.
- **5 (Service):** Performs a technical inspection simulation for each registered vehicle.
- **0 (Exit):** Closes the application and clears the cache memory.

## 4. Data Validation
The system ensures database consistency through validation mechanisms:
* **VIN Verification:** The program will reject any VIN number that does not contain exactly **17 characters**. In case of an error, you will be asked to enter it again.
* **Data Types:** Technical fields (mileage, operating hours) accept numbers only. Entering letters will display the message: `"Input Error"`.

## 4.1. Registration Date Format
When adding a new vehicle, the system will request a registration date:
* **Manual Format:** Enter the date in the format `YYYY-MM-DD` (e.g., `2024-05-15`).
* **Automatic Completion:** Leaving the field empty and pressing `Enter` will automatically assign **today’s date**.

## 5. Service Procedures
By selecting option **5**, the system automatically matches the service type to the vehicle category:
- Land vehicles: `Service: Sir, this will work out, sir.`
- Air vehicles: `Service: He will fly like lightning.`
- Water vehicles: `Service: Replacing the rear drive propeller (XDDDD).`


*Document prepared for a school project.*

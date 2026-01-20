# Automation Exercise — User Login Flow

## Overview

This project automates the **User Login flow** on [Automation Exercise](https://www.automationexercise.com) using **Selenium WebDriver**, **Java**, and the **Page Object Model (POM)**.

**Automated Flow:**

1. Navigate to the website
2. Click **"Signup / Login"**
3. Enter valid credentials
4. Verify the username appears after login
5. Capture screenshots on failure

---

## Prerequisites

* Java JDK 11 or higher
* Maven
* Chrome browser + ChromeDriver
* IDE (IntelliJ, Eclipse, or similar)

---

## Setup & Execution

### 1. Clone the repository

```bash
git clone https://github.com/elshimaasaadeldin/automationexcersie-login.git
```

### 2. Go to the project folder and build with Maven

```bash
cd automationexcersie-login
mvn clean install
```

### 3. Run the tests

```bash
mvn test
```

**Notes:**

* Screenshots of failures are saved in the `screenshots` folder.
* Update login credentials in `LoginPage.java` before running the tests.

---
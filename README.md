Here’s a complete `README.md` file for your Selenium setup guide using Java, IntelliJ IDEA, and ChromeDriver. It's formatted in Markdown and includes all step-by-step instructions you mentioned:

---

````markdown
# Selenium Java Automation Setup Guide (May 2025)

This guide walks you through setting up Selenium WebDriver with Java using IntelliJ IDEA and ChromeDriver.

---

## ✅ Step-by-Step Guide

### 1. Install Java Development Kit (JDK)

**Why?** Java is required to write and run Selenium tests.

**How?**  
- Download the JDK from:
  - Oracle: https://www.oracle.com/java/technologies/javase-downloads.html
  - OpenJDK (e.g., Adoptium): https://adoptium.net/
- Download the latest version (e.g., **JDK 21**).
- Follow the installer instructions to complete installation.

---

### 2. Set the `JAVA_HOME` Environment Variable

#### On Windows:
1. Right-click **This PC** → **Properties** → **Advanced system settings** → **Environment Variables**.
2. Under **System Variables**, click **New**:
   - Variable name: `JAVA_HOME`
   - Variable value: `C:\Program Files\Java\jdk-21` (or your installed path)
3. Edit the **Path** variable:
   - Add: `%JAVA_HOME%\bin`

#### On macOS/Linux:
1. Edit your shell config file (`~/.bashrc` or `~/.zshrc`):
    ```bash
    export JAVA_HOME=$(/usr/libexec/java_home)
    export PATH=$JAVA_HOME/bin:$PATH
    ```
2. Apply changes:
    ```bash
    source ~/.bashrc
    # or
    source ~/.zshrc
    ```

---

### 3. Verify Java Installation

Run in terminal or command prompt:

```bash
java -version
javac -version
````

**Expected Output:**

```
java 21.0.1 2024-10-15
javac 21.0.1
```

---

### 4. Install IntelliJ IDEA (IDE)

**Why?** An IDE simplifies coding, debugging, and running tests.

**How?**

* Download from: [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
* Install and launch IntelliJ IDEA.
* Create a new Java project:

  * **File → New → Project → Java**
  * Choose your installed JDK.
  * Name your project (e.g., `SeleniumTest`).

---

### 5. Install Selenium WebDriver

**Why?** Enables automated browser interactions.

**How?**

* Download Selenium Java bindings: [https://www.selenium.dev/downloads/](https://www.selenium.dev/downloads/)
* Extract the ZIP and note the `.jar` files.

In IntelliJ:

* Go to **File → Project Structure → Modules → Dependencies**
* Click ➕ → **JARs or directories**
* Add:

  * `selenium-java-x.x.x.jar`
  * All JARs inside the `/lib` folder
* Click **OK** to save.

---

### 6. Install ChromeDriver

**Why?** Bridges Selenium and the Chrome browser.

**How?**

* Check your Chrome version:

  * **Chrome → Settings → About Chrome**
* Download matching ChromeDriver from:
  [https://googlechromelabs.github.io/chrome-for-testing/](https://googlechromelabs.github.io/chrome-for-testing/)
* Extract the driver and move it to a known path:

  * Windows: `C:\Selenium\chromedriver.exe`
  * macOS/Linux: `/usr/local/bin/chromedriver`
* Add the path to your system's environment variables OR specify it in your code.

---

### 7. Write Your First Selenium Test

In IntelliJ, create a new Java class (`Main.java`) and paste:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Set path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe"); // Change path if needed

        // Initialize browser
        WebDriver driver = new ChromeDriver();

        // Navigate to GitHub
        driver.get("https://github.com");

        // Wait 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close browser
        driver.quit();
    }
}
```

---

### 8. Compile and Run the Test

**Option 1: IntelliJ**

* Click the green **Run** button beside `main()`.

**Option 2: Terminal**

```bash
javac Main.java
java Main
```

**Expected Output:**

* Chrome opens.
* Navigates to `https://github.com`.
* Waits 5 seconds.
* Closes the browser.

---

## 🎉 You’re Ready!

You’ve now set up Selenium WebDriver with Java and written your first automated test using ChromeDriver.

```

---

Would you like a downloadable `.md` file or GitHub-style folder structure too?
```

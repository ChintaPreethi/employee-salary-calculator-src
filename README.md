# 💼 Employee Salary Calculator

A simple Java console-based Employee Salary Calculator that calculates an employee's gross salary, tax, and net salary based on their basic salary.

The project demonstrates Java Object-Oriented Programming concepts and basic salary calculations.

## ✨ Features

* 👤 Enter employee ID
* 🧑 Enter employee name
* 💰 Enter basic salary
* 🏠 Calculate HRA
* 📊 Calculate DA
* 💵 Calculate gross salary
* 🧾 Calculate tax
* 💳 Calculate net salary
* 📄 Generate a formatted salary slip
* ✅ Validate salary input

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Scanner
* Methods
* Conditional Statements
* Loops
* Basic Arithmetic

## 📁 Project Structure

```text id="7qlv9h"
employee-salary-calculator/
│
├── src/
│   ├── Employee.java
│   └── EmployeeSalaryCalculator.java
│
└── README.md
```

## 📊 Salary Calculation

### HRA

HRA is calculated as **20% of the basic salary**.

```text
HRA = Basic Salary × 20%
```

### DA

DA is calculated as **10% of the basic salary**.

```text
DA = Basic Salary × 10%
```

### Gross Salary

```text
Gross Salary = Basic Salary + HRA + DA
```

### Tax

| Gross Salary      | Tax    |
| ----------------- | ------ |
| Above ₹50,000     | 10%    |
| ₹30,001 – ₹50,000 | 5%     |
| ₹30,000 or below  | No Tax |

### Net Salary

```text
Net Salary = Gross Salary - Tax
```

## ▶️ How to Run

### 1. Clone the repository

```bash id="xv0f5a"
git clone YOUR_GITHUB_REPOSITORY_URL
```

### 2. Open the project

```bash id="6w3f8y"
cd employee-salary-calculator
```

### 3. Navigate to the source folder

```bash id="dyc7x1"
cd src
```

### 4. Compile the Java files

```bash id="kq2j0x"
javac Employee.java EmployeeSalaryCalculator.java
```

### 5. Run the application

```bash id="3grm8e"
java EmployeeSalaryCalculator
```

## 💻 Example

```text id="v3z2g9"
=================================
     EMPLOYEE SALARY CALCULATOR
=================================

Enter employee ID: 101
Enter employee name: Afrin
Enter basic salary: ₹40000

=================================
          SALARY SLIP
=================================
Employee ID   : 101
Employee Name : Afrin
---------------------------------
Basic Salary  : ₹40000.00
HRA (20%)     : ₹8000.00
DA (10%)      : ₹4000.00
Gross Salary  : ₹52000.00
Tax           : ₹5200.00
---------------------------------
Net Salary    : ₹46800.00
=================================
```

## 🧠 Java Concepts Used

This project demonstrates:

* Classes and Objects
* Constructors
* Encapsulation
* Private variables
* Methods
* `if-else` statements
* `while` loop
* `Scanner`
* Arithmetic operations
* Formatted output

## 🚀 Future Improvements

Possible improvements include:

* Multiple employee records
* Employee search by ID
* Employee department
* Employee designation
* Bonus calculation
* Database integration
* Generate salary slips as files
* GUI interface

## 👩‍💻 Author

**Preethi c**

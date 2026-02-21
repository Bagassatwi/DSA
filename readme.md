# Jobsheet 2 ASD

## 2.1.3 Questions

### 1. Name two characteristics of a class or object!
* **Attributes (State):** Variables that define the data
* **Methods (Behavior):** Functions that define the actions the object can do

### 2. Pay attention to the Mahasiswa class in Practicum 1, how many attributes do the Student class have? Mention what the attributes are!

1. `nama` (String)
2. `nim` (String)
3. `kelas` (String)
4. `ipk` (double)

### 3. How many methods does the class have? Mention what the methods are!

1. `ubahKelas(String kelas)`: Updates the `kelas` attribute.
2. `updateIpk(double ipk)`: Updates the `ipk` attribute.
3. `tampilkanInformasi()`: Prints attribute values to the console.
4. `nilaiKinerja()`: Evaluates and returns a performance category based on GPA.

### 4. Pay attention to the method updateIpk contained in the Mahasiswa class. Modify the content of the method so that the GPA entered is valid, namely first checking whether the GPA entered is in the range of 0.0 to 4.0 (0.0 <= GPA <= 4.0). If the GPA is not in that range, the message is issued: "GPA is invalid. Must be between 0.0 and 4.0".

```java
void updateIpk(double ipk) {
    if (ipk >= 0.0 && ipk <= 4.0) {
        this.ipk = ipk;
    } else {
        System.out.println("GPA is invalid. Must be between 0.0 and 4.0");
    }
}

```

### 5. Explain how the nilaiKinerja() method works in evaluating student performance, what criteria are used to determine the performance value, and what is returned by the nilaiKinerja() method?

The method uses conditional `if-else if-else` structure to print the current value of the `ipk` attribute. <br>
  
  **Criteria:**
* `ipk >= 3.5`: Returns "Kinerja Sangat Baik".
* `3.0 <= ipk < 3.5`: Returns "Kinerja Baik".
* `2.0 <= ipk < 3.0`: Returns "Kinerja Cukup".
* `ipk < 2.0`: Returns "Kinerja Kurang".


* **Return Value:** A `String` representing the descriptive performance category.
### 6. Commit and push program code to Github
<https://github.com/Bagassatwi/DSA>

## 2.2.3 Questions

### 1. In the StudentMain class, indicate the line of program code used for the instance process! What is the name of the resulting object?
The line of code used for the instance process is:
`Mahasiswa05 mhs1 = new Mahasiswa05();`
* The resulting object name is **`mhs1`**.

### 2. How do I access the attributes and methods of an object?

Attributes and methods of an object are accessed using the dot operator **`.`**.

* **Syntax for Attributes:** `objectName.attributeName = value;` (e.g., `mhs1.nama = "..."`)
* **Syntax for Methods:** `objectName.methodName(arguments);` (e.g., `mhs1.tampilkanInformasi()`)

### 3. Why are the output output results of the method tampilkanInformasi() first and second different?

The output of the two `tampilkanInformasi()` calls differs because we used the method `ubahKelas` and `updateIpk` which changes the data of the object

## 2.3.3 Questions

### 1. In the Mahasiswa class in practicum 3, indicate the program code line used to declare a parameterized constructor!
```java
public Mahasiswa05(String nama, String nim, String kelas, double ipk) {   
    this.nama = nama;
    this.nim = nim;
    this.kelas = kelas;
    this.ipk = ipk;
}
```

### 2. Pay attention to the StudentMain class. What exactly does the following line of program do?

The line `Mahasiswa05 mhs2 = new Mahasiswa05("Nabila Salsabila Putri", "252105020125", "TKI 1A", 3.78);` does everything below:
* **Declaration:** `Mahasiswa05 mhs2` creates a reference variable of type `Mahasiswa05`.
* **Initialization:** The constructor value is given, assigning **"Nabila Salsabila Putri"** to `nama`, **"252105020125"** to `nim`, **"TKI 1A"** to `kelas`, and **3.78** to `ipk`.
### 3. Remove the default constructor on the Mahasiswa class, and then compile and run the program. How did it turn out? Explain why this is the case!

The program will fail to compile, because:

* A constructor with a parameter is already defined in `Mahasiswa05`, the compiler does not generate the default constructor if not explicitly defined.
* In `StudentMain05`, the line `Mahasiswa05 mhs1 = new Mahasiswa05();` attempts to call a default constructor, which doesn't exist.

### 4. After instantiating the object, do the methods in the Mahasiswa class have to be accessed sequentially? Explain why!

No, because they're an independent functions which means executing one does not require the execution of the other

### 5. Create a new object with the name mhs<StudentName> using the parameterized constructor from the Mahasiswa class!

```java
    Mahasiswa05 mhsBella = new Mahasiswa05("Nabila Putri Widya", "250101020125", "TKI 1B", 4);
```
### 6. Commit and push program code to Github
<https://github.com/Bagassatwi/DSA>

## 2.4 Practicum Exercises
<https://github.com/Bagassatwi/DSA>

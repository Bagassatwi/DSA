## Jobsheet 2 ASD

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

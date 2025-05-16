# Doctor and Patient Management API

This is a Spring Boot 3 backend application for managing doctors and patients, and suggesting doctors based on patient symptoms and location.

## 🏥 Project Features

- Add or remove **Doctors** and **Patients**
- Suggest suitable doctors for a patient based on:
  - Symptom → Doctor's speciality mapping
  - Patient's location
- Validations for fields like name, city, email, and phone
- Error handling for unsupported cities and unmatched symptoms
- MySQL database with JPA/Hibernate
- API tested using Postman

---

## 📁 Project Structure

src/
├── controller/
│ ├── DoctorController.java
│ ├── PatientController.java
│ └── SuggestionController.java
├── model/
│ ├── Doctor.java
│ └── Patient.java
├── repository/
│ ├── DoctorRepository.java
│ └── PatientRepository.java
├── service/
│ ├── DoctorService.java
│ └── PatientService.java
├── DoctorPatientApplication.java
└── resources/
└── application.properties

yaml
Copy
Edit

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3
- Spring Data JPA (Hibernate)
- MySQL
- Jakarta Validation
- Lombok
- Maven
- Postman (for API testing)

---

## 🧾 API Endpoints

### 👨‍⚕️ Doctor APIs

| Method | Endpoint           | Description          |
|--------|--------------------|----------------------|
| POST   | `/doctors`         | Add a new doctor     |
| DELETE | `/doctors/{id}`    | Remove a doctor      |

### 👨‍💼 Patient APIs

| Method | Endpoint           | Description           |
|--------|--------------------|-----------------------|
| POST   | `/patients`        | Add a new patient     |
| DELETE | `/patients/{id}`   | Remove a patient      |

### 💡 Doctor Suggestion API

| Method | Endpoint                  | Description                            |
|--------|---------------------------|----------------------------------------|
| GET    | `/suggestion/{patientId}` | Suggest doctors for a patient by ID    |

---

## 🔁 Symptom to Speciality Mapping

| Symptom          | Speciality    |
|------------------|---------------|
| Arthritis        | Orthopaedic   |
| Back Pain        | Orthopaedic   |
| Tissue injuries  | Orthopaedic   |
| Dysmenorrhea     | Gynecology    |
| Skin infection   | Dermatology   |
| Skin burn        | Dermatology   |
| Ear pain         | ENT           |

---

## ⚠️ Validations

- **Name**: Min 3 characters
- **City**: Max 20 characters (Patients); Fixed values for doctors (Delhi, Noida, Faridabad)
- **Email**: Must be valid
- **Phone**: Min 10 digits
- **Speciality**: Must be one of the allowed options1. Clone the repository:

```bash
git clone (https://github.com/2100291520037/DocterAndPatient)
cd doctor-patient-api
Setup MySQL database:

sql
Copy
Edit
CREATE DATABASE doctor_patient;
Configure DB in application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/doctor_patient
spring.datasource.username=root
spring.datasource.password=your_password
Build and run the app:

bash
Copy
Edit
./mvnw spring-boot:run
📬 Postman Collection
File: postman/DoctorPatientAPI.postman_collection.json

Includes test cases for:

Adding/removing doctors & patients

Suggesting doctors

🖼️ Screenshots
➕ Add Doctor (POST /doctors)

💡 Suggest Doctor (GET /suggestion/{id})

🧑‍💻 Author
Name: [Your Name]

GitHub: github.com/yourusername

📜 License
This project is open source and available under the MIT License.

yaml
Copy
Edit

---

Let me know if you want help:
- Generating the Postman collection
- Writing Swagger/OpenAPI documentation
- Writing test cases with JUnit

Would you like me to generate the DTOs next?

---

## 🔧 How to Run

1. Clone the repository:

```bash


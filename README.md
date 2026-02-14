# 📘 BookMyStay – Core Java Hotel Booking Application

BookMyStay is a **console-based Core Java application** that simulates a hotel room booking system.  
The project is designed to demonstrate **advanced Java concepts** including Generics, Collections, Java 8 features, Exception Handling, Custom Annotations, Regex Validation, and JUnit Testing.

---

## 🚀 Features

- Type-safe room handling using **Generics & Bounded Types**
- Booking management using **Java Collections**
- Custom **checked & unchecked exception handling**
- **Java 8** features: Streams, Lambdas, Optional, Method References
- Regex-based validation for **email, phone number, and password**
- Custom annotation with **runtime processing**
- JUnit test cases with **85%+ code coverage (SonarQube-ready)**

---

## 🧱 Project Architecture

BookMyStay/
│
├── Main.java → Application entry point
│
├── model/ → Domain models (Room, Guest, Booking)
│
├── service/
│ ├── RoomHandler.java → Generic room handling + streams
│ └── BookingService.java → Core booking logic
│
├── validation/
│ └── Validator.java → Regex validation + method references
│
├── annotation/
│ └── BookingValidation.java → Custom annotation
│
├── exception/
│ ├── NoRoomAvailableException.java
│ └── InvalidInputException.java
│
└── test/
└── BookingServiceTest.java → JUnit test cases



---

## 🧠 Core Java Concepts Used

### 🔹 Generics
- Bounded types: `T extends Room`
- Wildcards: `RoomHandler<? extends Room>`

### 🔹 Java Collections
| Collection | Purpose |
|----------|--------|
| ArrayList | Store bookings |
| LinkedList | Waitlist |
| Queue | First-Come-First-Served |
| Stack | Undo last booking |
| Set | Unique guests |
| Map | Room inventory with atomic updates |

---

## ⚙️ Java 8 Features

- **Lambda Expressions** – Room price comparator
- **Streams API** – Filter & sort available rooms
- **Optional** – Null-safe room booking
- **Method References** – Validation logic

---

## 🛡️ Validation Rules

- **Email**: Valid email format
- **Phone**: Indian mobile number format
- **Password**:
    - Minimum 8 characters
    - At least 1 uppercase, 1 lowercase, 1 digit, 1 special character

Implemented using `Pattern`, `Matcher`, `matches()` and `replaceAll()`.

---

## ❌ Exception Handling

- `NoRoomAvailableException` (Checked Exception)
- `InvalidInputException` (Unchecked Exception)
- Proper usage of `try-catch-finally`, `throw`, and `throws`

---

## 🏷️ Custom Annotation

```java
@BookingValidation(email = true, phone = true, password = true)





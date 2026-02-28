# 🏠 Dorm Monitoring and Visitor Log System

A Java desktop-based Dormitory Monitoring System designed to efficiently manage visitor check-ins, check-outs, and resident visit tracking using MySQL as the database backend.

---

## 📌 Project Overview

The Dorm Monitoring and Visitor Log System replaces manual logbooks with a secure, organized, and automated solution for dormitory visitor management. Built specifically for dormitories without dedicated security guards, it enables staff to monitor visitors seamlessly.

**Key features include:**

- Tracking visitors entering and leaving the dorm
- Monitoring active visitors in real-time
- Recording visitor details and visit purposes
- Detecting overstaying visitors automatically
- Maintaining accurate digital records for reporting and oversight

---

## 🎯 System Objectives

- Replace manual visitor logbooks
- Ensure accountability of visitors
- Improve dormitory monitoring efficiency
- Provide real-time active visitor tracking
- Support structured data collection for reports
- Enhance overall safety and security

---

## 👥 User Roles

### 1️⃣ Administrator
Full access to all features, including:

- Managing residents and rooms
- Viewing all visitor logs
- Monitoring violations
- Generating reports
- Configuring system settings
- Managing user accounts

### 2️⃣ Operator
Handles daily visitor operations:

- Checking visitors in and out
- Viewing active visitors
- Searching residents
- Registering new visitors

---

## 🔄 System Workflow

### 🟦 Visitor Check-In Flow
1. Select Host Resident
2. Enter Visitor Details:
   - Full Name
   - Sex
   - Relationship to Resident
   - Purpose of Visit
   - Contact Number
3. System records In-Time automatically
4. Operator clicks **Check-In Visitor**
5. Visitor appears in **Visitors Inside Now**

### 🟨 Visitor Check-Out Flow
1. Select active visitor
2. System calculates visit duration
3. If overstayed:
   - Mark as **OVERSTAY**
4. Record Time-Out and update status

---

## 🗄 Database Structure (Core Tables)

| Table            | Description                                              |
|------------------|----------------------------------------------------------|
| **users**        | Stores login credentials and user roles                  |
| **residents**    | Resident information                                    |
| **visitors**     | Visitor profiles for quick re-entry                     |
| **visit_logs**   | Records of visits with timestamps, relationships, purposes, and statuses |
| **operator_actions** | (Optional) Tracks check-in/out accountability   |

---

## ⚙️ System Features

### ✅ Visitor Monitoring
- Real-time active visitor dashboard
- Auto-overstay detection

### ✅ Data Recording
- Personal visitor information
- Relationship and visit purpose
- Timestamps for check-in/out

### ✅ Automation
- Automatic In-Time stamping
- Overstay detection and status updates

### ✅ Security
- Role-based access control
- Password hashing
- Controlled data entry

---

## 🖥 Technology Stack

| Component   | Technology                     |
|-------------|-------------------------------|
| **Frontend** | Java Swing / JavaFX          |
| **Backend**  | Java                         |
| **Database** | MySQL, JDBC (MySQL Connector/J) |
| **IDE**      | NetBeans / IntelliJ IDEA     |

---

## 🎨 UI Design Principles

- Blue and yellow color scheme
- Clean sidebar navigation
- Sectioned workflow layout
- Large, accessible action buttons
- Clear visual status indicators

---

## 🛠 Installation Guide

### 1️⃣ Requirements
- JDK 15+
- MySQL Server
- MySQL Connector/J
- Java IDE (NetBeans recommended)

### 2️⃣ Database Setup
```sql
CREATE DATABASE dorm_system;
```
- Import the provided SQL schema file.
- Update connection details in `DBConnection.java`:
```java
String url = "jdbc:mysql://localhost:3306/dorm_system";
String username = "root";
String password = "yourpassword";
```

### 3️⃣ Run the Application
- Open the project in your IDE
- Build the project
- Run `DormSystemOfKyle.java` (Main Class)

---

## 📊 Key System Modules
- Authentication Module
- Operator Dashboard
- Visitor Check-In Page
- Visitor Check-Out Page
- Active Visitors Monitoring
- Resident Management (Admin)
- Reporting (Admin)

---

## 🚀 Future Improvements
- QR code visitor passes
- Photo capture on check-in
- SMS notifications to residents
- Exportable PDF visitor logs
- Analytics dashboard

---

## 📁 Project Structure
```
DormSystem/
├── Administrator/
│   └── Admin_Dashboard.java
├── Operator/
│   └── Operator_Dashboard.java
├── DBConnection.java
├── Login.java
├── Home.java
```

---

## 🔒 Data Integrity Measures
- Foreign key constraints
- Controlled status transitions
- Validation for required fields
- Time-based validation
- Automatic overstay updates

---

## 📌 Why This System Matters

Manual logbooks:
- Are prone to loss
- Difficult to search and analyze
- Hard to monitor in real-time

This system provides:
- Digital tracking
- Faster operations
- Improved monitoring
- Reliable records

---

## 📄 License

This project is developed for academic purposes.

---

## 👨‍💻 Developers

Developed as part of a final system project.

**Dorm Monitoring and Visitor Log System © 2026**

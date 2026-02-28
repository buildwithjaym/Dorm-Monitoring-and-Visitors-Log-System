🏠 Dorm Monitoring and Visitor Log System

A Java Desktop-based Dormitory Monitoring System designed to manage visitor check-ins, check-outs, and resident visit tracking efficiently using MySQL as the database backend.

📌 Project Overview

The Dorm Monitoring and Visitor Log System is built to replace manual logbooks and provide a secure, organized, and automated solution for dormitory visitor management.

This system allows dorm administrators and operators to:

Track visitors entering and leaving the dorm

Monitor active visitors in real-time

Record visitor information and visit purpose

Detect overstaying visitors automatically

Maintain accurate digital records for reporting and monitoring

This project is designed specifically for dormitories without dedicated security guards, where staff members manage visitor monitoring through an organized system.

🎯 System Objectives

Replace manual visitor logbooks

Ensure accountability of visitors

Improve dormitory monitoring efficiency

Provide real-time tracking of active visitors

Support structured data collection for reporting

Enhance safety and monitoring processes

👥 User Roles
1️⃣ Administrator

Full system access and control.

Capabilities:

Manage residents

Manage rooms

View all visitor logs

View violations

Generate reports

Configure system settings

Manage user accounts

2️⃣ Operator

Handles daily visitor check-in and check-out operations.

Capabilities:

Check-in visitors

Check-out visitors

View active visitors

Search residents

Register new visitors

🔄 System Workflow
🟦 Visitor Check-In Flow

Select Host Resident

Enter Visitor Information:

Full Name

Sex

Relationship to Resident

Purpose of Visit

Contact Number

System automatically sets In Time

Maximum allowed duration is displayed

Operator clicks Check-In Visitor

Visitor appears in "Visitors Inside Now"

🟨 Visitor Check-Out Flow

Operator selects active visitor

System calculates duration

If duration exceeds allowed time:

Visitor is marked as OVERSTAY

Record is updated with Time-Out

🗄 Database Structure (Operator Side)
Core Tables
1. users

Stores system login accounts.

2. residents

Stores dorm resident information.

3. visitors

Stores visitor profiles for quick re-entry.

4. visit_logs

Stores visit transaction records:

time_in

time_out

relationship

purpose

status (ACTIVE, COMPLETED, OVERSTAY)

5. operator_actions (Optional)

Tracks check-in/check-out accountability.

⚙️ System Features
✅ Visitor Monitoring

Real-time active visitor tracking

"Visitors Inside Now" dashboard

Auto-overstay detection

✅ Data Recording

Visitor personal information

Relationship tracking

Purpose documentation

Timestamp logging

✅ Automation

Automatic In Time

Automatic overstay calculation

Status updates (ACTIVE → OVERSTAY → COMPLETED)

✅ Security

Role-based access control

Hashed passwords

Controlled data entry

🖥 Technology Stack
Component	Technology
Frontend	Java (Swing / JavaFX)
Backend	Java
Database	MySQL
JDBC Driver	MySQL Connector/J
IDE	NetBeans / IntelliJ
🎨 UI Design Principles

Blue and Yellow color scheme

Clean sidebar navigation

Sectioned workflow layout

Large action buttons for fast operations

Clear visual status indicators

🛠 Installation Guide
1️⃣ Requirements

JDK 15+

MySQL Server

MySQL Connector/J

Java IDE (NetBeans recommended)

2️⃣ Database Setup

Create database:

CREATE DATABASE dorm_system;

Import the provided SQL schema file.

Update database connection in:

DBConnection.java

Example:

String url = "jdbc:mysql://localhost:3306/dorm_system";
String username = "root";
String password = "yourpassword";
3️⃣ Run the Application

Open project in IDE

Build project

Run DormSystemOfKyle.java (Main Class)

📊 Key System Modules

Authentication Module

Operator Dashboard

Visitor Check-In Page

Visitor Check-Out Page

Active Visitors Monitoring

Resident Management (Admin)

Reporting (Admin)

🚀 Future Improvements

QR code visitor pass

Photo capture on check-in

SMS notification to resident

Exportable PDF visitor logs

Analytics dashboard

📁 Project Structure
DormSystem
│
├── Administrator/
│   └── Admin_Dashboard.java
│
├── Operator/
│   └── Operator_Dashboard.java
│
├── DBConnection.java
├── Login.java
├── Home.java
🔒 Data Integrity Measures

Foreign key constraints

Controlled status transitions

Required field validation

Time-based validation logic

Overstay auto-update logic

📌 Why This System Matters

Manual visitor logbooks:

Are prone to loss

Hard to search

Hard to analyze

Difficult to monitor in real-time

This system provides:

Digital tracking

Faster operations

Better monitoring

Reliable record keeping

📄 License

This project is developed for academic purposes.

👨‍💻 Developers

Developed as part of a final system.

Dorm Monitoring and Visitor Log System
© 2026
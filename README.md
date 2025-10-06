# 📝 Complaint Tracking System (Full Stack)

A full-stack project built with **Spring Boot (Java)** for the backend and **React.js** for the frontend.  
This system allows users to raise complaints, track their status, and for admins to manage and update complaints.

---

## 🚀 Tech Stack
- **Backend**: Java 17, Spring Boot, Spring Security (JWT), JPA, H2 Database
- **Frontend**: React.js, Axios, Bootstrap (for UI)
- **Build Tools**: Maven, npm
- **Authentication**: JWT-based login with roles (Admin/User)

---

## 📂 Project Structure
ComplaintTrackingSystem/
├── backend/ # Spring Boot backend (API + Security + Database)
└── frontend/ # React frontend (UI + API integration)


---

## ⚙️ How to Run

### 1. Clone the repo
```bash
git clone https://github.com/<your-username>/ComplaintTrackingSystem.git
cd ComplaintTrackingSystem

2. Run Backend (Spring Boot)
cd backend
mvn spring-boot:run


Backend runs on: http://localhost:8080

3. Run Frontend (React)
cd frontend
npm install
npm start


Frontend runs on: http://localhost:3000

🔐 Authentication

Register: POST /api/auth/register

Login: POST /api/auth/login → returns JWT

Use JWT for secure endpoints:

Authorization: Bearer <your-token>


Roles:

USER → create/view complaints

ADMIN → manage complaints (close/reopen)

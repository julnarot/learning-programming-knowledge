# Flask + Vue 3 (Vite + TypeScript)
A modern full-stack boilerplate featuring a robust Flask REST API and a high-performance Vue 3 frontend powered by Vite and TypeScript.


## 🏗 Project Structure
```bash
.
├── app.py
├── frontend
│   ├── dist
│   ├── index.html
│   ├── node_modules
│   ├── package-lock.json
│   ├── package.json
│   ├── public
│   ├── README.md
│   ├── src
│   ├── tsconfig.app.json
│   ├── tsconfig.json
│   ├── tsconfig.node.json
│   └── vite.config.ts
├── README.md
├── requirements.txt
└── venv
    ...
```


## 📋 Prerequisites

Ensure you have the following installed:

- Python 3.10+
- Node.js 20+
- NPM or Yarn


## 🚀 Getting Started (Development)
### 1. Frontend Setup (Vue + TS)

```bash
cd frontend
npm install
npm run build
```
### 2. Backend Setup (Flask)

```bash

python3 -m venv venv
source venv/bin/activate  # Windows: venv\Scripts\activate
pip install -r requirements.txt
python app.py
```

*Server running at: http://127.0.0.1:5000*



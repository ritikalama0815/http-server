# Simple Java HTTP Server

This is a basic HTTP server written in Java using core libraries like `ServerSocket` and `Socket`. It listens for incoming connections on port **3000**, reads the raw HTTP request sent by a client (like a web browser or cURL), and prints the request to the console.

---

## How It Works

- The server uses a **`ServerSocket`** to listen on port `3000`.
- It waits for client connections in an **infinite loop**, keeping the server running.
- When a client connects, it accepts the connection using `accept()`.
- It reads and prints the incoming HTTP request line-by-line.
- **Note:** This version only reads and prints the request—it doesn't send a response yet.

---

## Key Concepts

- **Blocking Socket:** The call to `serverSocket.accept()` blocks until a client connects.
- **Stateless Protocol:** HTTP is stateless; the server doesn't remember past connections.
- **BufferedReader + InputStreamReader:** Used to read text from the client's request.

---

## Requirements

- Java Development Kit (JDK) 8 or higher

---

## How to Run

1. **Compile the server:**

   ```bash
   javac HttpServer.java

# Java Fundamentals: Object Arrays & Constructors

## 🎯 Professional Overview
This module demonstrates a deep dive into Java's memory model and object initialization patterns. In production environments, efficient object creation and collection management are the bedrock of high-performance applications. This repository focuses on the transition from primitive data handling to **Object-Oriented architecture**.

---



## 💻 Logic Demonstration

```java
/**
 * Represents a Resource entity. 
 * Demonstrates clean constructor patterns and state management.
 */
class Resource {
    private String name;
    private int id;

    public Resource(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void process() {
        System.out.println("Processing Resource [" + id + "]: " + name);
    }
}

public class ResourceManager {
    public static void main(String[] args) {
        // Initializing a collection of references
        Resource[] registry = new Resource[3];

        // Manual instantiation to demonstrate heap allocation
        registry[0] = new Resource("Database_Alpha", 101);
        registry[1] = new Resource("Cloud_Storage", 102);
        registry[2] = new Resource("API_Gateway", 103);

        // Safe iteration through the object collection
        for (Resource res : registry) {
            if (res != null) {
                res.process();
            }
        }
    }
}

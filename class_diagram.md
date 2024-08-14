+------------------+

|     Product      |

+------------------+

| - id: int        |

| - name: string   |

| - description: string |

| - price: float   |

| - sku: string    |

| - category: string |

| - quantity: int  |

+------------------+

| + createProduct()|

| + getProduct()   |

| + updateProduct()|

| + deleteProduct()|

+------------------+

^

|

| 1

|

| *

+------------------+

|    StockMovement |

+------------------+

| - id: int        |

| - productId: int |

| - quantity: int  |

| - type: string   |  // "IN" or "OUT"

| - timestamp: Date|

+------------------+

| + recordEntry()  |

| + recordExit()   |

+------------------+

^

|

| 1

|

| *

+------------------+

|      User        |

+------------------+

| - id: int        |

| - username: string |

| - password: string |

| - role: string   |  // "Admin" or "Operator"

+------------------+

| + login()        |

| + logout()       |

| + refreshToken() |

+------------------+

^

|

| 1

|

| *

+------------------+

|   Notification   |

+------------------+

| - id: int        |

| - userId: int    |

| - message: string|

| - type: string   |  // "Email" or "SMS"

| - timestamp: Date|

+------------------+

| + sendNotification() |

+------------------+

^

|

| 1

|

| *

+------------------+

|    Report        |

+------------------+

| - id: int        |

| - type: string   |  // "LowStock", "Movement", "Inventory"

| - data: string   |

| - generatedAt: Date |

+------------------+

| + generateReport() |

+------------------+
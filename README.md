# SimpleArrayList

ArrayList 實作時內部使用Object陣列來保存收集物件，因此考慮是否使用ArrayList就等於考慮是否要使用陣列的特性

1.陣列在記憶體中是連續的線性空間，根據索引(index)隨機存取時速度快
2.調整索引順序時，會有較差的表現。

## Array vs ArrayLsit
Array是Java中的基本功能。
ArrayList就是Collection Framework的一部分。



ArrayList是一個有浮動大小的Array，可以自動擴充。
Array是一個有固定大小的Array。


Array透過[]的方式新增元素而ArrayList就透過add()。
Array透過[]的方式存取元素而ArrayList就透過get()。

Array 可以包含primitive data types 和object entities。
ArrayList 只可以包含object entries 但不支持primitive data types。


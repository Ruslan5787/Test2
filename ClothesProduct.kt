class ClothesProduct(
    _name: String,
    _price: Int,
    _unitsMeasurement: String,
    _type: String,
    _quantities: Int,
    _material: String,
) : AClothesProduct(
    _name,
    _price,
    _unitsMeasurement,
    _type,
    _quantities,
    _material
) {
    fun getProductInfo() {
        println("Название товара - ${this.name}. Цена - ${this.price}. Тип - ${this.type}. Количество - ${this.quantities}. Материал - ${material}");
    }
}
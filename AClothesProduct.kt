abstract class AClothesProduct(
    _name: String,
    _price: Int,
    _unitsMeasurement: String,
    _type: String,
    _quantities: Int,
    _material: String,
) : IClothesProduct {
    override var name: String = _name;
    override var price: Int = _price;
    override var unitsMeasurement: String = _unitsMeasurement;
    override var type: String = _type;
    override var quantities: Int = _quantities;
    var material: String = _material;

    fun getMaterial() {
        println("${name} сделана из ${material} материала.");
    }

    override fun calculateDiscountPrice(discount: Int) {
        println(this.price * (discount / 100.0));
    }

    override fun getInformationAboutQuantityGoods() {
        when (this.quantities) {
            2 -> println("Маленькое количество.");
            4 -> println("Среднее количество.");
            10 -> println("Большое количество.");
            else -> println("Необычное количество.");
        }
    }
}
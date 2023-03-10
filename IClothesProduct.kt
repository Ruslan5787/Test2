 interface IClothesProduct {
    val name: String;
    val price: Int;
    val unitsMeasurement: String;
    val type: String;
    val quantities: Int;

    fun calculateDiscountPrice(discount: Int);

    fun getInformationAboutQuantityGoods();
}

import kotlinx.coroutines.*;

@OptIn(DelicateCoroutinesApi::class)
suspend fun main() {
    println("Хотите работать с программой с задержкой (Да/Нет)");
    val userAnswer = readLine().toString();
    if (userAnswer == "Да") {
        println("Сколько раз хотите повторить работу программы");

        val userAnswer = readLine()!!.toInt();

        if (userAnswer > 0) {
            for (i in 0..userAnswer) {
                try {
                    print("Введите название товара: ");
                    val productName = readLine().toString();

                    print("Введите цену товара: ");
                    val price = readLine()!!.toInt();

                    print("Введите единицы измерения товара: ");
                    val unitsMeasurementName = readLine().toString();

                    print("Введите тип товара: ");
                    val typeName = readLine().toString();

                    print("Введите количество товара: ");
                    val quantitiesName = readLine()!!.toInt();

                    print("Введите процент скидки на товара: ");
                    val discount = readLine()!!.toInt();

                    print("Введите процент материал товара: ");
                    val material = readLine().toString();

                    if (price > 0 && discount >= 0) {
                        val product1 = ClothesProduct(
                            productName,
                            price,
                            unitsMeasurementName,
                            typeName,
                            quantitiesName,
                            material
                        );

                        GlobalScope.launch {
                            delay(1000L);
                            print("Вся информация о товаре: ");
                            product1.getProductInfo();
                        }

                        GlobalScope.launch {
                            delay(2000L);
                            print("Информация о количестве товаров: ");
                            product1.getInformationAboutQuantityGoods();
                        }

                        GlobalScope.launch {
                            delay(3000L);
                            print("Сумма скидки в зависимости:");
                            product1.calculateDiscountPrice(discount);
                        }

                        runBlocking {
                            delay(4000L);
                        }
                    } else {
                        println("Введите корректные данные");
                    }
                } catch (e: NumberFormatException) {
                    println("Введите корректные данные");
                }
            }
        } else {
            println("Введите коректное число");
        }

    } else {
        try {
            print("Введите название товара: ");
            val productName = readLine().toString();

            print("Введите цену товара: ");
            val price = readLine()!!.toInt();

            print("Введите единицы измерения товара: ");
            val unitsMeasurementName = readLine().toString();

            print("Введите тип товара: ");
            val typeName = readLine().toString();

            print("Введите количество товара: ");
            val quantitiesName = readLine()!!.toInt();

            print("Введите процент скидки на товара: ");
            val discount = readLine()!!.toInt();

            print("Введите процент материал товара: ");
            val material = readLine().toString();

            if (price > 0 && discount >= 0) {
                val product1 = ClothesProduct(
                    productName,
                    price,
                    unitsMeasurementName,
                    typeName,
                    quantitiesName,
                    material
                );

                print("Вся информация о товаре: ");
                product1.getProductInfo();

                print("Информация о количестве товаров: ");
                product1.getInformationAboutQuantityGoods();

                print("Сумма скидки в зависимости: ");
                product1.calculateDiscountPrice(discount);
            } else {
                println("Введите корректные данные");
            }
        } catch (e: NumberFormatException) {
            println("Введите корректные данные");
        }

    }
}

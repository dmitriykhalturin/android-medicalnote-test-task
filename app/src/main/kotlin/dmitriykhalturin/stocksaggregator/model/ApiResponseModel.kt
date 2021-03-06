package dmitriykhalturin.stocksaggregator.model

/**
 * Created by Dmitriy Khalturin <dmitry.halturin.86@gmail.com>
 * for android-medicalnote-test-task on 20.03.19 2:56.
 */
object ApiResponseModel {

  data class GetStocks(
    val stock: List<Stock>,
    val as_of: String
  )

  data class Stock(
    val name: String,
    val price: Price,
    val percent_change: Float,
    val volume: Float,
    val symbol: String
  )

  data class Price(
    val currency: String,
    val amount: Float
  )

}

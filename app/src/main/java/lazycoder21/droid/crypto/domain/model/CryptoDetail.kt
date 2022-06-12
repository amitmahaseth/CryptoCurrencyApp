package lazycoder21.droid.crypto.domain.model

data class CryptoDetail(
    val volume: String? = null,
    val symbol: String = "",
    val askPrice: String? = null,
    val at: Long? = null,
    val lowPrice: String? = null,
    val highPrice: String? = null,
    val openPrice: String? = null,
    val baseAsset: String? = null,
    val quoteAsset: String? = null,
    val bidPrice: String? = null,
    val lastPrice: String? = null,
    val id: Int? = null,
    var favourite: Boolean = false,
)


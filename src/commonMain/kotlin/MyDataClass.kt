import annotations.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
data class MyDataClass(
    val stringValue: String,
    val intValue: String
)
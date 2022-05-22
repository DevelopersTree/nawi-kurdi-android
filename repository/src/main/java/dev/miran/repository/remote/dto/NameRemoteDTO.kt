package dev.miran.repository.remote.dto

import com.squareup.moshi.Json

/*"nameId": 1785,
"name": "ڤالی",
"desc": "ڤالی چەند واتایەک دەگەیەنێت لە ناوی ئیمپڕاتۆری سێیەمی ڕۆمانەکان هاتووە کەناوی ڤالێریان بووە پێیان گوتوە ڤالی ٫ وە لە ئەمریکا ناوچەیەک یاخوود پانتاییەکی گەورە ی تەکنەلۆچی  هەیە کەبەنزیکەی دوانزە شار ەخۆی دەگرێت پێی دەڵێن سیلیکۆن ڤالی / وە لە فارسیدا بە والی دەڵێن ڤالی واتە حاکم یان والی   س",
"gender": "M",
"positive_votes": 200,
"negative_votes": 135*/
class NameRemoteDTO(
    @Json(name = "nameId") val id: Int,
    @Json(name = "name") val name: String,
    @Json(name = "desc") val description: String,
    @Json(name = "gender") val gender: String,
    @Json(name = "positive_votes") val upVote: Int,
    @Json(name = "negative_votes") val downVote: Int
)
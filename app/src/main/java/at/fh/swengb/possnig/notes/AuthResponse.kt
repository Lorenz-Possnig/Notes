package at.fh.swengb.possnig.notes

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuthResponse(val token: String) {
}
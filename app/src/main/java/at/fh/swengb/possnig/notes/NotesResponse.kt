package at.fh.swengb.possnig.notes

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class NotesResponse(var lastSync: Long, var notes: List<Note>) {
}
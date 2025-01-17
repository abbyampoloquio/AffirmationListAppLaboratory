package com.example.affirmationlistapp.Ampoloquio.data
import com.example.affirmationlistapp.Ampoloquio.R
import com.example.affirmationlistapp.Ampoloquio.models.Affirmation


class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2),
            Affirmation(R.string.affirmation3, R.drawable.image3),
            Affirmation(R.string.affirmation4, R.drawable.image4),
            Affirmation(R.string.affirmation5, R.drawable.image5)
        )
    }
}
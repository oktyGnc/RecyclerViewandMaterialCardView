package com.example.materialcardviewinarecyclerview.data

import com.example.materialcardviewinarecyclerview.model.Affirmation
import com.example.materialcardviewinarecyclerview.R

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation("Finding tranquility while getting lost in the blue of the sea.", R.drawable.image1),
            Affirmation("Journeying into a hidden world within the depths of the forest.", R.drawable.image2),
            Affirmation("Nature's elegance in the riot of colors within the flowers.", R.drawable.image3),
            Affirmation("The endless cycle of life in the arms of trees.", R.drawable.image4),
            Affirmation("Witnessing nature's awakening with the sparkle of the sun.",
                R.drawable.image5
            ),
            Affirmation("Feeling freedom at the rising peaks of the mountains.", R.drawable.image6),
            Affirmation("An endless story in the sky with the dance of clouds.", R.drawable.image7),
        )
    }
}

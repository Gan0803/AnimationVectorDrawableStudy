package gan0803.pj.study.animatedvectordrawablestudy

import android.graphics.drawable.Animatable
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    companion object {
        const val STATE_TRIANGLE = 0
        const val STATE_RECT = 1
    }

    private val state = STATE_TRIANGLE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageButton>(R.id.imageButton).setOnClickListener {
            val imageButton = it as ImageButton
            val animatable: Animatable = imageButton.drawable as Animatable
            animatable.start()
        }

    }
}
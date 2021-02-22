package gan0803.pj.study.animatedvectordrawablestudy

import android.graphics.drawable.Animatable
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {
    companion object {
        const val STATE_TRIANGLE = 0
        const val STATE_RECT = 1
        const val STATE_PAUSE = 0
        const val STATE_PLAY = 1
    }

    private var state = STATE_TRIANGLE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageButton>(R.id.imageButton).setOnClickListener {
            val imageButton = it as ImageButton
            var drawable = R.drawable.triangle_to_rect
            if (state == STATE_RECT) {
                drawable = R.drawable.rect_to_triangle
                state = STATE_TRIANGLE
            } else {
                state = STATE_RECT
            }
            imageButton.setImageDrawable(ResourcesCompat.getDrawable(resources, drawable, null))
            val animatable: Animatable = imageButton.drawable as Animatable
            animatable.start()
        }

        findViewById<ImageButton>(R.id.imageButton2).setOnClickListener {
            val imageButton = it as ImageButton
            var drawable = R.drawable.pause_to_play
            if (state == STATE_PLAY) {
                drawable = R.drawable.play_to_pause
                state = STATE_PAUSE
            } else {
                state = STATE_PLAY
            }
            imageButton.setImageDrawable(ResourcesCompat.getDrawable(resources, drawable, null))
            val animatable: Animatable = imageButton.drawable as Animatable
            animatable.start()
        }
    }
}
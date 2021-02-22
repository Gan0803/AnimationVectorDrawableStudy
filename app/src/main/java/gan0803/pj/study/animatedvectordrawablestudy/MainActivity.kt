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

    private var state1 = STATE_TRIANGLE
    private var state2 = STATE_PAUSE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageButton>(R.id.imageButton).setOnClickListener {
            val imageButton = it as ImageButton
            var drawable = R.drawable.triangle_to_rect
            if (state1 == STATE_RECT) {
                drawable = R.drawable.rect_to_triangle
                state1 = STATE_TRIANGLE
            } else {
                state1 = STATE_RECT
            }
            imageButton.setImageDrawable(ResourcesCompat.getDrawable(resources, drawable, null))
            val animatable: Animatable = imageButton.drawable as Animatable
            animatable.start()
        }

        findViewById<ImageButton>(R.id.imageButton2).setOnClickListener {
            val imageButton = it as ImageButton
            var drawable = R.drawable.pause_to_play
            if (state2 == STATE_PLAY) {
                drawable = R.drawable.play_to_pause
                state2 = STATE_PAUSE
            } else {
                state2 = STATE_PLAY
            }
            imageButton.setImageDrawable(ResourcesCompat.getDrawable(resources, drawable, null))
            val animatable: Animatable = imageButton.drawable as Animatable
            animatable.start()
        }
    }
}
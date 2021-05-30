package com.example.shorty

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var arrVideoModel = ArrayList<VideoModel>()
    var videoAdapter:VideoAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrVideoModel.add(VideoModel("Tree with flowers","The branches of a tree wave in the breeze, with pointy leaves ","https://assets.mixkit.co/videos/preview/mixkit-tree-with-yellow-flowers-1173-large.mp4"))
        arrVideoModel.add(VideoModel("multicolored lights","A man with a small beard and mustache wearing a white sweater, sunglasses, and a backwards black baseball cap turns his head in different directions under changing colored lights.","https://assets.mixkit.co/videos/preview/mixkit-man-under-multicolored-lights-1237-large.mp4"))
        arrVideoModel.add(VideoModel("holding neon light","Bald man with a short beard wearing a large jean jacket holds a long tubular neon light thatch","https://assets.mixkit.co/videos/preview/mixkit-man-holding-neon-light-1238-large.mp4"))
        arrVideoModel.add(VideoModel("Sun over hills","The sun sets or rises over hills, a body of water beneath them.","https://assets.mixkit.co/videos/preview/mixkit-sun-over-hills-1183-large.mp4"))
        arrVideoModel.add(VideoModel("Female boxer training","Portrait of a female kickboxer training her punch and kick speed in a boxing ring","https://assets.mixkit.co/videos/preview/mixkit-portrait-of-a-female-boxer-training-on-the-ring-40254-large.mp4"))
        arrVideoModel.add(VideoModel("Cars on an avenue of a big city during sunset","Cars driving down an avenue surrounded by buildings of a big city during sunset, while the shot slowly rises towards the yellow and pink sky.","https://assets.mixkit.co/videos/preview/mixkit-cars-on-an-avenue-of-a-big-city-during-sunset-40635-large.mp4"))
        arrVideoModel.add(VideoModel("Photographer working","Young male photographer observing the panorama carefully, in a dirt field in nature, on a sunny day","https://assets.mixkit.co/videos/preview/mixkit-photographer-working-outside-in-a-desert-34406-large.mp4"))
        arrVideoModel.add(VideoModel("Car roads and the train in one shot from above","Intersection of automobile and train roads, on a roundabout in a city, in a shot from above.","https://assets.mixkit.co/videos/preview/mixkit-car-roads-and-the-train-in-one-shot-from-above-40668-large.mp4"))
        arrVideoModel.add(VideoModel("Circuit board","Circuit board from a computer working.","https://assets.mixkit.co/videos/preview/mixkit-circuit-board-2381-large.mp4"))

        videoAdapter = VideoAdapter(arrVideoModel)
        viewPager.adapter = videoAdapter

    }
}
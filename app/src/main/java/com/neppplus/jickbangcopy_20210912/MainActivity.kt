package com.neppplus.jickbangcopy_20210912

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20210912.datas.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(  RoomData(8000, "서울시 동대문구", 5, "1번째 방입니다.")  )
        mRoomList.add(  RoomData(25000, "서울시 서대문구", 8, "2번째 방입니다.")  )
        mRoomList.add(  RoomData(74000, "서울시 동작구", 0, "3번째 방입니다.")  )
        mRoomList.add(  RoomData(162000, "서울시 은평구", -1, "4번째 방입니다.")  )
        mRoomList.add(  RoomData(5500, "서울시 중랑구", 7, "5번째 방입니다.")  )
        mRoomList.add(  RoomData(27000, "서울시 성북구", -2, "6번째 방입니다.")  )
        mRoomList.add(  RoomData(79000, "서울시 강서구", 0, "7번째 방입니다.")  )
        mRoomList.add(  RoomData(3300, "서울시 강남구", 3, "8번째 방입니다.")  )
        mRoomList.add(  RoomData(37500, "서울시 서초구", 8, "9번째 방입니다.")  )
        mRoomList.add(  RoomData(28600, "서울시 송파구", 2, "10번째 방입니다.")  )

    }
}
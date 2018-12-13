package com.cattracker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        /*var all = listOf<String>("1","""R"" Street Village Apts.",1,5:40,G,1,37.3353841,-120.4867372
2,"""R"" Street Village Apts.",1,6:47,G,11,37.3353841,-120.4867372
        3,"""R"" Street Village Apts.",1,8:14,G,21,37.3353841,-120.4867372
4,"""R"" Street Village Apts.",1,9:21,G,31,37.3353841,-120.4867372
        5,"""R"" Street Village Apts.",1,10:28,G,41,37.3353841,-120.4867372
6,"""R"" Street Village Apts.",1,11:55,G,51,37.3353841,-120.4867372
        7,"""R"" Street Village Apts.",1,13:02,G,61,37.3353841,-120.4867372
8,"""R"" Street Village Apts.",1,14:09,G,71,37.3353841,-120.4867372
        9,"""R"" Street Village Apts.",1,15:36,G,81,37.3353841,-120.4867372
10,"""R"" Street Village Apts.",1,16:43,G,91,37.3353841,-120.4867372
        11,"""R"" Street Village Apts.",1,17:50,G,101,37.3353841,-120.4867372
12,"""R"" Street Village Apts.",1,19:17,G,111,37.3353841,-120.4867372
        13,"""R"" Street Village Apts.",1,20:24,G,121,37.3353841,-120.4867372
14,"""R"" Street Village Apts.",1,21:31,G,131,37.3353841,-120.4867372
        15,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,5:45,G,2,37.335707,-120.490445
        16,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,6:52,G,12,37.335707,-120.490445
        17,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,8:19,G,22,37.335707,-120.490445
        18,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,9:26,G,32,37.335707,-120.490445
        19,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,10:33,G,42,37.335707,-120.490445
        20,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,12:00,G,52,37.335707,-120.490445
        21,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,13:07,G,62,37.335707,-120.490445
        22,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,14:14,G,72,37.335707,-120.490445
        23,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,15:41,G,82,37.335707,-120.490445
        24,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,16:48,G,92,37.335707,-120.490445
        25,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,17:55,G,102,37.335707,-120.490445
        26,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,19:22,G,112,37.335707,-120.490445
        27,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,20:29,G,122,37.335707,-120.490445
        28,Merced College The Bus terminal,3,5:50,G,3,37.334558,-120.477976
        29,Merced College The Bus terminal,3,6:57,G,13,37.334558,-120.477976
        30,Merced College The Bus terminal,3,8:24,G,23,37.334558,-120.477976
        31,Merced College The Bus terminal,3,9:31,G,33,37.334558,-120.477976
        32,Merced College The Bus terminal,3,10:38,G,43,37.334558,-120.477976
        33,Merced College The Bus terminal,3,12:05,G,53,37.334558,-120.477976
        34,Merced College The Bus terminal,3,13:12,G,63,37.334558,-120.477976
        35,Merced College The Bus terminal,3,14:19,G,73,37.334558,-120.477976
        36,Merced College The Bus terminal,3,15:46,G,83,37.334558,-120.477976
        37,Merced College The Bus terminal,3,16:53,G,93,37.334558,-120.477976
        38,Merced College The Bus terminal,3,18:00,G,103,37.334558,-120.477976
        39,Merced College The Bus terminal,3,19:27,G,113,37.334558,-120.477976
        40,Merced College The Bus terminal,3,20:34,G,123,37.334558,-120.477976
        41,Ironstone Dr.,4,5:52,G,4,37.342589,-120.4806
        42,Ironstone Dr.,4,6:59,G,14,37.342589,-120.4806
        43,Ironstone Dr.,4,8:26,G,24,37.342589,-120.4806
        44,Ironstone Dr.,4,9:33,G,34,37.342589,-120.4806
        45,Ironstone Dr.,4,10:40,G,44,37.342589,-120.4806
        46,Ironstone Dr.,4,12:07,G,54,37.342589,-120.4806
        47,Ironstone Dr.,4,13:14,G,64,37.342589,-120.4806
        48,Ironstone Dr.,4,14:21,G,74,37.342589,-120.4806
        49,Ironstone Dr.,4,15:48,G,84,37.342589,-120.4806
        50,Ironstone Dr.,4,16:55,G,94,37.342589,-120.4806
        51,Ironstone Dr.,4,18:02,G,104,37.342589,-120.4806
        52,Ironstone Dr.,4,19:29,G,114,37.342589,-120.4806
        53,Ironstone Dr.,4,20:36,G,124,37.342589,-120.4806
        54,Bellevue Ranch on Arrow Wood Dr.,5,5:56,G,5,37.3526891,-120.4781953
        55,Bellevue Ranch on Arrow Wood Dr.,5,7:03,G,15,37.3526891,-120.4781953
        56,Bellevue Ranch on Arrow Wood Dr.,5,8:30,G,25,37.3526891,-120.4781953
        57,Bellevue Ranch on Arrow Wood Dr.,5,9:37,G,35,37.3526891,-120.4781953
        58,Bellevue Ranch on Arrow Wood Dr.,5,10:44,G,45,37.3526891,-120.4781953
        59,Bellevue Ranch on Arrow Wood Dr.,5,12:11,G,55,37.3526891,-120.4781953
        60,Bellevue Ranch on Arrow Wood Dr.,5,13:18,G,65,37.3526891,-120.4781953
        61,Bellevue Ranch on Arrow Wood Dr.,5,14:25,G,75,37.3526891,-120.4781953
        62,Bellevue Ranch on Arrow Wood Dr.,5,15:52,G,85,37.3526891,-120.4781953
        63,Bellevue Ranch on Arrow Wood Dr.,5,16:59,G,95,37.3526891,-120.4781953
        64,Bellevue Ranch on Arrow Wood Dr.,5,18:06,G,105,37.3526891,-120.4781953
        65,Bellevue Ranch on Arrow Wood Dr.,5,19:33,G,115,37.3526891,-120.4781953
        66,Bellevue Ranch on Arrow Wood Dr.,5,20:40,G,125,37.3526891,-120.4781953
        67,Mammoth Lakes Rd.,6,6:03,G,6,37.363256,-120.429404
        68,Mammoth Lakes Rd.,6,7:10,G,16,37.363256,-120.429404
        69,Mammoth Lakes Rd.,6,8:37,G,26,37.363256,-120.429404
        70,Mammoth Lakes Rd.,6,9:44,G,36,37.363256,-120.429404
        71,Mammoth Lakes Rd.,6,10:51,G,46,37.363256,-120.429404
        72,Mammoth Lakes Rd.,6,12:18,G,56,37.363256,-120.429404
        73,Mammoth Lakes Rd.,6,13:25,G,66,37.363256,-120.429404
        74,Mammoth Lakes Rd.,6,14:32,G,76,37.363256,-120.429404
        75,Mammoth Lakes Rd.,6,15:59,G,86,37.363256,-120.429404
        76,Mammoth Lakes Rd.,6,17:06,G,96,37.363256,-120.429404
        77,Mammoth Lakes Rd.,6,18:13,G,106,37.363256,-120.429404
        78,Mammoth Lakes Rd.,6,19:40,G,116,37.363256,-120.429404
        79,Mammoth Lakes Rd.,6,20:47,G,126,37.363256,-120.429404
        80,Student Activities & Athletics Center,7,6:08,G,7,37.3654274,-120.4262007
        81,Student Activities & Athletics Center,7,7:35,G,17,37.3654274,-120.4262007
        82,Student Activities & Athletics Center,7,8:42,G,27,37.3654274,-120.4262007
        83,Student Activities & Athletics Center,7,9:49,G,37,37.3654274,-120.4262007
        84,Student Activities & Athletics Center,7,11:16,G,47,37.3654274,-120.4262007
        85,Student Activities & Athletics Center,7,12:23,G,57,37.3654274,-120.4262007
        86,Student Activities & Athletics Center,7,13:30,G,67,37.3654274,-120.4262007
        87,Student Activities & Athletics Center,7,14:57,G,77,37.3654274,-120.4262007
        88,Student Activities & Athletics Center,7,16:04,G,87,37.3654274,-120.4262007
        89,Student Activities & Athletics Center,7,17:11,G,97,37.3654274,-120.4262007
        90,Student Activities & Athletics Center,7,18:38,G,107,37.3654274,-120.4262007
        91,Student Activities & Athletics Center,7,19:45,G,117,37.3654274,-120.4262007
        92,Student Activities & Athletics Center,7,20:52,G,127,37.3654274,-120.4262007
        93,Emigrant Pass at Scholars Lane,8,6:10,G,8,37.3637409,-120.4305694
        94,Emigrant Pass at Scholars Lane,8,7:37,G,18,37.3637409,-120.4305694
        95,Emigrant Pass at Scholars Lane,8,8:44,G,28,37.3637409,-120.4305694
        96,Emigrant Pass at Scholars Lane,8,9:51,G,38,37.3637409,-120.4305694
        97,Emigrant Pass at Scholars Lane,8,11:18,G,48,37.3637409,-120.4305694
        98,Emigrant Pass at Scholars Lane,8,12:25,G,58,37.3637409,-120.4305694
        99,Emigrant Pass at Scholars Lane,8,13:32,G,68,37.3637409,-120.4305694
        100,Emigrant Pass at Scholars Lane,8,14:59,G,78,37.3637409,-120.4305694
        101,Emigrant Pass at Scholars Lane,8,16:06,G,88,37.3637409,-120.4305694
        102,Emigrant Pass at Scholars Lane,8,17:13,G,98,37.3637409,-120.4305694
        103,Emigrant Pass at Scholars Lane,8,18:40,G,108,37.3637409,-120.4305694
        104,Emigrant Pass at Scholars Lane,8,19:47,G,118,37.3637409,-120.4305694
        105,Emigrant Pass at Scholars Lane,8,20:54,G,128,37.3637409,-120.4305694
        106,Amtrak,9,6:25,G,9,37.307412,-120.477543
        107,Amtrak,9,7:52,G,19,37.307412,-120.477543
        108,Amtrak,9,8:59,G,29,37.307412,-120.477543
        109,Amtrak,9,10:06,G,39,37.307412,-120.477543
        110,Amtrak,9,11:33,G,49,37.307412,-120.477543
        111,Amtrak,9,12:40,G,59,37.307412,-120.477543
        112,Amtrak,9,13:47,G,69,37.307412,-120.477543
        113,Amtrak,9,15:14,G,79,37.307412,-120.477543
        114,Amtrak,9,16:21,G,89,37.307412,-120.477543
        115,Amtrak,9,17:28,G,99,37.307412,-120.477543
        116,Amtrak,9,18:55,G,109,37.307412,-120.477543
        117,Amtrak,9,20:02,G,119,37.307412,-120.477543
        118,Amtrak,9,21:09,G,129,37.307412,-120.477543
        119,K St. Between 18th St. & 19th St. (The Bus Stop),10,6:26,G,10,37.302271,-120.481111
        120,K St. Between 18th St. & 19th St. (The Bus Stop),10,7:53,G,20,37.302271,-120.481111
        121,K St. Between 18th St. & 19th St. (The Bus Stop),10,9:00,G,30,37.302271,-120.481111
        122,K St. Between 18th St. & 19th St. (The Bus Stop),10,10:07,G,40,37.302271,-120.481111
        123,K St. Between 18th St. & 19th St. (The Bus Stop),10,11:34,G,50,37.302271,-120.481111
        124,K St. Between 18th St. & 19th St. (The Bus Stop),10,12:41,G,60,37.302271,-120.481111
        125,K St. Between 18th St. & 19th St. (The Bus Stop),10,13:48,G,70,37.302271,-120.481111
        126,K St. Between 18th St. & 19th St. (The Bus Stop),10,15:15,G,80,37.302271,-120.481111
        127,K St. Between 18th St. & 19th St. (The Bus Stop),10,16:22,G,90,37.302271,-120.481111
        128,K St. Between 18th St. & 19th St. (The Bus Stop),10,17:29,G,100,37.302271,-120.481111
        129,K St. Between 18th St. & 19th St. (The Bus Stop),10,18:56,G,110,37.302271,-120.481111
        130,K St. Between 18th St. & 19th St. (The Bus Stop),10,20:03,G,120,37.302271,-120.481111
        131,K St. Between 18th St. & 19th St. (The Bus Stop),10,21:10,G,130,37.302271,-120.481111
        132,Moraga Subdivision,1,5:55,FASTCAT,1,37.332027,-120.438567
        133,Moraga Subdivision,1,7:02,FASTCAT,20,37.332027,-120.438567
        134,Moraga Subdivision,1,8:29,FASTCAT,39,37.332027,-120.438567
        135,Moraga Subdivision,1,9:36,FASTCAT,58,37.332027,-120.438567
        136,Moraga Subdivision,1,1:43,FASTCAT,77,37.332027,-120.438567
        137,Moraga Subdivision,1,1:50,FASTCAT,96,37.332027,-120.438567
        138,Moraga Subdivision,1,13:17,FASTCAT,115,37.332027,-120.438567
        139,Moraga Subdivision,1,14:24,FASTCAT,134,37.332027,-120.438567
        140,Moraga Subdivision,1,15:51,FASTCAT,153,37.332027,-120.438567
        141,Moraga Subdivision,1,16:58,FASTCAT,172,37.332027,-120.438567
        142,Moraga Subdivision,1,18:25,FASTCAT,191,37.332027,-120.438567
        143,Moraga Subdivision,1,19:32,FASTCAT,210,37.332027,-120.438567
        144,Moraga Subdivision,1,20:39,FASTCAT,229,37.332027,-120.438567
        145,Moraga Subdivision,1,21:46,FASTCAT,248,37.332027,-120.438567
        146,Moraga Subdivision,1,23:13,FASTCAT,267,37.332027,-120.438567
        147,Yosemite Church (McKee Rd.),2,5:55,FASTCAT,2,37.332027,"-120,442,899"
        148,Yosemite Church (McKee Rd.),2,7:02,FASTCAT,21,37.332027,"-120,442,899"
        149,Yosemite Church (McKee Rd.),2,8:29,FASTCAT,40,37.332027,"-120,442,899"
        150,Yosemite Church (McKee Rd.),2,9:36,FASTCAT,59,37.332027,"-120,442,899"
        151,Yosemite Church (McKee Rd.),2,1:43,FASTCAT,78,37.332027,"-120,442,899"
        152,Yosemite Church (McKee Rd.),2,1:50,FASTCAT,97,37.332027,"-120,442,899"
        153,Yosemite Church (McKee Rd.),2,13:17,FASTCAT,116,37.332027,"-120,442,899"
        154,Yosemite Church (McKee Rd.),2,14:24,FASTCAT,135,37.332027,"-120,442,899"
        155,Yosemite Church (McKee Rd.),2,15:51,FASTCAT,154,37.332027,"-120,442,899"
        156,Yosemite Church (McKee Rd.),2,16:58,FASTCAT,173,37.332027,"-120,442,899"
        157,Yosemite Church (McKee Rd.),2,18:25,FASTCAT,192,37.332027,"-120,442,899"
        158,Yosemite Church (McKee Rd.),2,19:32,FASTCAT,211,37.332027,"-120,442,899"
        159,Yosemite Church (McKee Rd.),2,20:39,FASTCAT,230,37.332027,"-120,442,899"
        160,Yosemite Church (McKee Rd.),2,21:46,FASTCAT,249,37.332027,"-120,442,899"
        161,Yosemite Church (McKee Rd.),2,23:13,FASTCAT,268,37.332027,"-120,442,899"
        162,University Surgery Center,3,5:57,FASTCAT,3,37.332207,-120.451404
        163,University Surgery Center,3,7:04,FASTCAT,22,37.332207,-120.451404
        164,University Surgery Center,3,8:31,FASTCAT,41,37.332207,-120.451404
        165,University Surgery Center,3,9:38,FASTCAT,60,37.332207,-120.451404
        166,University Surgery Center,3,1:45,FASTCAT,79,37.332207,-120.451404
        167,University Surgery Center,3,1:52,FASTCAT,98,37.332207,-120.451404
        168,University Surgery Center,3,13:19,FASTCAT,117,37.332207,-120.451404
        169,University Surgery Center,3,14:26,FASTCAT,136,37.332207,-120.451404
        170,University Surgery Center,3,15:53,FASTCAT,155,37.332207,-120.451404
        171,University Surgery Center,3,17:00,FASTCAT,174,37.332207,-120.451404
        172,University Surgery Center,3,18:27,FASTCAT,193,37.332207,-120.451404
        173,University Surgery Center,3,19:34,FASTCAT,212,37.332207,-120.451404
        174,University Surgery Center,3,20:41,FASTCAT,231,37.332207,-120.451404
        175,University Surgery Center,3,21:48,FASTCAT,250,37.332207,-120.451404
        176,University Surgery Center,3,23:15,FASTCAT,269,37.332207,-120.451404
        177,Starbucks/Promenade Center,4,6:01,FASTCAT,4,37.332027,-120.460492
        178,Starbucks/Promenade Center,4,7:08,FASTCAT,23,37.332027,-120.460492
        179,Starbucks/Promenade Center,4,8:35,FASTCAT,42,37.332027,-120.460492
        180,Starbucks/Promenade Center,4,9:42,FASTCAT,61,37.332027,-120.460492
        181,Starbucks/Promenade Center,4,1:49,FASTCAT,80,37.332027,-120.460492
        182,Starbucks/Promenade Center,4,1:56,FASTCAT,99,37.332027,-120.460492
        183,Starbucks/Promenade Center,4,13:23,FASTCAT,118,37.332027,-120.460492
        184,Starbucks/Promenade Center,4,14:30,FASTCAT,137,37.332027,-120.460492
        185,Starbucks/Promenade Center,4,15:57,FASTCAT,156,37.332027,-120.460492
        186,Starbucks/Promenade Center,4,17:04,FASTCAT,175,37.332027,-120.460492
        187,Starbucks/Promenade Center,4,18:31,FASTCAT,194,37.332027,-120.460492
        188,Starbucks/Promenade Center,4,19:38,FASTCAT,213,37.332027,-120.460492
        189,Starbucks/Promenade Center,4,20:45,FASTCAT,232,37.332027,-120.460492
        190,Starbucks/Promenade Center,4,21:52,FASTCAT,251,37.332027,-120.460492
        191,Starbucks/Promenade Center,4,23:19,FASTCAT,270,37.332027,-120.460492
        192,Mercy Hospital/Tri-College,5,6:04,FASTCAT,5,37.339455,-120.46875
        193,Mercy Hospital/Tri-College,5,7:11,FASTCAT,24,37.339455,-120.46875
        194,Mercy Hospital/Tri-College,5,8:38,FASTCAT,43,37.339455,-120.46875
        195,Mercy Hospital/Tri-College,5,9:45,FASTCAT,62,37.339455,-120.46875
        196,Mercy Hospital/Tri-College,5,1:52,FASTCAT,81,37.339455,-120.46875
        197,Mercy Hospital/Tri-College,5,1:59,FASTCAT,100,37.339455,-120.46875
        198,Mercy Hospital/Tri-College,5,13:26,FASTCAT,119,37.339455,-120.46875
        199,Mercy Hospital/Tri-College,5,14:33,FASTCAT,138,37.339455,-120.46875
        200,Mercy Hospital/Tri-College,5,16:00,FASTCAT,157,37.339455,-120.46875
        201,Mercy Hospital/Tri-College,5,17:07,FASTCAT,176,37.339455,-120.46875
        202,Mercy Hospital/Tri-College,5,18:34,FASTCAT,195,37.339455,-120.46875
        203,Mercy Hospital/Tri-College,5,19:41,FASTCAT,214,37.339455,-120.46875
        204,Mercy Hospital/Tri-College,5,20:48,FASTCAT,233,37.339455,-120.46875
        205,Mercy Hospital/Tri-College,5,21:55,FASTCAT,252,37.339455,-120.46875
        206,Mercy Hospital/Tri-College,5,23:22,FASTCAT,271,37.339455,-120.46875
        207,"Cardella Rd & ""M"" Street",6,6:04,FASTCAT,6,37.347495,-120.477322
        208,"Cardella Rd & ""M"" Street",6,7:11,FASTCAT,25,37.347495,-120.477322
        209,"Cardella Rd & ""M"" Street",6,8:38,FASTCAT,44,37.347495,-120.477322
        210,"Cardella Rd & ""M"" Street",6,9:45,FASTCAT,63,37.347495,-120.477322
        211,"Cardella Rd & ""M"" Street",6,1:52,FASTCAT,82,37.347495,-120.477322
        212,"Cardella Rd & ""M"" Street",6,1:59,FASTCAT,101,37.347495,-120.477322
        213,"Cardella Rd & ""M"" Street",6,13:26,FASTCAT,120,37.347495,-120.477322
        214,"Cardella Rd & ""M"" Street",6,14:33,FASTCAT,139,37.347495,-120.477322
        215,"Cardella Rd & ""M"" Street",6,16:00,FASTCAT,158,37.347495,-120.477322
        216,"Cardella Rd & ""M"" Street",6,17:07,FASTCAT,177,37.347495,-120.477322
        217,"Cardella Rd & ""M"" Street",6,18:34,FASTCAT,196,37.347495,-120.477322
        218,"Cardella Rd & ""M"" Street",6,19:41,FASTCAT,215,37.347495,-120.477322
        219,"Cardella Rd & ""M"" Street",6,20:48,FASTCAT,234,37.347495,-120.477322
        220,"Cardella Rd & ""M"" Street",6,21:55,FASTCAT,253,37.347495,-120.477322
        221,"Cardella Rd & ""M"" Street",6,23:22,FASTCAT,272,37.347495,-120.477322
        222,Bellevue Ranch on Arrow Wood Dr.,7,6:11,FASTCAT,7,37.3526891,-120.4781953
        223,Bellevue Ranch on Arrow Wood Dr.,7,7:18,FASTCAT,26,37.3526891,-120.4781953
        224,Bellevue Ranch on Arrow Wood Dr.,7,8:45,FASTCAT,45,37.3526891,-120.4781953
        225,Bellevue Ranch on Arrow Wood Dr.,7,9:52,FASTCAT,64,37.3526891,-120.4781953
        226,Bellevue Ranch on Arrow Wood Dr.,7,1:59,FASTCAT,83,37.3526891,-120.4781953
        227,Bellevue Ranch on Arrow Wood Dr.,7,1:06,FASTCAT,102,37.3526891,-120.4781953
        228,Bellevue Ranch on Arrow Wood Dr.,7,13:33,FASTCAT,121,37.3526891,-120.4781953
        229,Bellevue Ranch on Arrow Wood Dr.,7,14:40,FASTCAT,140,37.3526891,-120.4781953
        230,Bellevue Ranch on Arrow Wood Dr.,7,16:07,FASTCAT,159,37.3526891,-120.4781953
        231,Bellevue Ranch on Arrow Wood Dr.,7,17:14,FASTCAT,178,37.3526891,-120.4781953
        232,Bellevue Ranch on Arrow Wood Dr.,7,18:41,FASTCAT,197,37.3526891,-120.4781953
        233,Bellevue Ranch on Arrow Wood Dr.,7,19:48,FASTCAT,216,37.3526891,-120.4781953
        234,Bellevue Ranch on Arrow Wood Dr.,7,20:55,FASTCAT,235,37.3526891,-120.4781953
        235,Bellevue Ranch on Arrow Wood Dr.,7,22:02,FASTCAT,254,37.3526891,-120.4781953
        236,Bellevue Ranch on Arrow Wood Dr.,7,23:29,FASTCAT,273,37.3526891,-120.4781953
        237,Mammoth Lakes Rd.,8,6:18,FASTCAT,8,37.363256,-120.429404
        238,Mammoth Lakes Rd.,8,7:25,FASTCAT,27,37.363256,-120.429404
        239,Mammoth Lakes Rd.,8,8:52,FASTCAT,46,37.363256,-120.429404
        240,Mammoth Lakes Rd.,8,9:59,FASTCAT,65,37.363256,-120.429404
        241,Mammoth Lakes Rd.,8,1:06,FASTCAT,84,37.363256,-120.429404
        242,Mammoth Lakes Rd.,8,1:13,FASTCAT,103,37.363256,-120.429404
        243,Mammoth Lakes Rd.,8,13:40,FASTCAT,122,37.363256,-120.429404
        244,Mammoth Lakes Rd.,8,14:47,FASTCAT,141,37.363256,-120.429404
        245,Mammoth Lakes Rd.,8,16:14,FASTCAT,160,37.363256,-120.429404
        246,Mammoth Lakes Rd.,8,17:21,FASTCAT,179,37.363256,-120.429404
        247,Mammoth Lakes Rd.,8,18:48,FASTCAT,198,37.363256,-120.429404
        248,Mammoth Lakes Rd.,8,19:55,FASTCAT,217,37.363256,-120.429404
        249,Mammoth Lakes Rd.,8,21:02,FASTCAT,236,37.363256,-120.429404
        250,Mammoth Lakes Rd.,8,22:09,FASTCAT,255,37.363256,-120.429404
        251,Mammoth Lakes Rd.,8,23:36,FASTCAT,274,37.363256,-120.429404
        252,Student Activities & Athletic Center,9,6:23,FASTCAT,9,37.3654274,-120.4262007
        253,Student Activities & Athletic Center,9,7:50,FASTCAT,28,37.3654274,-120.4262007
        254,Student Activities & Athletic Center,9,8:57,FASTCAT,47,37.3654274,-120.4262007
        255,Student Activities & Athletic Center,9,1:04,FASTCAT,66,37.3654274,-120.4262007
        256,Student Activities & Athletic Center,9,1:11,FASTCAT,85,37.3654274,-120.4262007
        257,Student Activities & Athletic Center,9,1:38,FASTCAT,104,37.3654274,-120.4262007
        258,Student Activities & Athletic Center,9,13:45,FASTCAT,123,37.3654274,-120.4262007
        259,Student Activities & Athletic Center,9,15:12,FASTCAT,142,37.3654274,-120.4262007
        260,Student Activities & Athletic Center,9,16:19,FASTCAT,161,37.3654274,-120.4262007
        261,Student Activities & Athletic Center,9,17:46,FASTCAT,180,37.3654274,-120.4262007
        262,Student Activities & Athletic Center,9,18:53,FASTCAT,199,37.3654274,-120.4262007
        263,Student Activities & Athletic Center,9,20:00,FASTCAT,218,37.3654274,-120.4262007
        264,Student Activities & Athletic Center,9,21:07,FASTCAT,237,37.3654274,-120.4262007
        265,Student Activities & Athletic Center,9,22:34,FASTCAT,256,37.3654274,-120.4262007
        266,Student Activities & Athletic Center,9,23:41,FASTCAT,275,37.3654274,-120.4262007
        267,Emigrant Pass at Scholars Lane,10,6:25,FASTCAT,10,37.3637409,-120.4305694
        268,Emigrant Pass at Scholars Lane,10,7:52,FASTCAT,29,37.3637409,-120.4305694
        269,Emigrant Pass at Scholars Lane,10,8:59,FASTCAT,48,37.3637409,-120.4305694
        270,Emigrant Pass at Scholars Lane,10,1:06,FASTCAT,67,37.3637409,-120.4305694
        271,Emigrant Pass at Scholars Lane,10,1:13,FASTCAT,86,37.3637409,-120.4305694
        272,Emigrant Pass at Scholars Lane,10,1:40,FASTCAT,105,37.3637409,-120.4305694
        273,Emigrant Pass at Scholars Lane,10,13:47,FASTCAT,124,37.3637409,-120.4305694
        274,Emigrant Pass at Scholars Lane,10,15:14,FASTCAT,143,37.3637409,-120.4305694
        275,Emigrant Pass at Scholars Lane,10,16:21,FASTCAT,162,37.3637409,-120.4305694
        276,Emigrant Pass at Scholars Lane,10,17:48,FASTCAT,181,37.3637409,-120.4305694
        277,Emigrant Pass at Scholars Lane,10,18:55,FASTCAT,200,37.3637409,-120.4305694
        278,Emigrant Pass at Scholars Lane,10,20:02,FASTCAT,219,37.3637409,-120.4305694
        279,Emigrant Pass at Scholars Lane,10,21:09,FASTCAT,238,37.3637409,-120.4305694
        280,Emigrant Pass at Scholars Lane,10,22:36,FASTCAT,257,37.3637409,-120.4305694
        281,Bellevue Ranch on Arrow Wood Dr.,11,6:32,FASTCAT,11,37.3526891,-120.4781953
        282,Bellevue Ranch on Arrow Wood Dr.,11,7:59,FASTCAT,30,37.3526891,-120.4781953
        283,Bellevue Ranch on Arrow Wood Dr.,11,9:06,FASTCAT,49,37.3526891,-120.4781953
        284,Bellevue Ranch on Arrow Wood Dr.,11,1:13,FASTCAT,68,37.3526891,-120.4781953
        285,Bellevue Ranch on Arrow Wood Dr.,11,1:20,FASTCAT,87,37.3526891,-120.4781953
        286,Bellevue Ranch on Arrow Wood Dr.,11,1:47,FASTCAT,106,37.3526891,-120.4781953
        287,Bellevue Ranch on Arrow Wood Dr.,11,13:54,FASTCAT,125,37.3526891,-120.4781953
        288,Bellevue Ranch on Arrow Wood Dr.,11,15:21,FASTCAT,144,37.3526891,-120.4781953
        289,Bellevue Ranch on Arrow Wood Dr.,11,16:28,FASTCAT,163,37.3526891,-120.4781953
        290,Bellevue Ranch on Arrow Wood Dr.,11,17:55,FASTCAT,182,37.3526891,-120.4781953
        291,Bellevue Ranch on Arrow Wood Dr.,11,19:02,FASTCAT,201,37.3526891,-120.4781953
        292,Bellevue Ranch on Arrow Wood Dr.,11,20:09,FASTCAT,220,37.3526891,-120.4781953
        293,Bellevue Ranch on Arrow Wood Dr.,11,21:16,FASTCAT,239,37.3526891,-120.4781953
        294,Bellevue Ranch on Arrow Wood Dr.,11,22:43,FASTCAT,258,37.3526891,-120.4781953
        295,Tri-College/Mercy Hospital,12,6:37,FASTCAT,12,37.339455,-120.46875
        296,Tri-College/Mercy Hospital,12,8:04,FASTCAT,31,37.339455,-120.46875
        297,Tri-College/Mercy Hospital,12,9:11,FASTCAT,50,37.339455,-120.46875
        298,Tri-College/Mercy Hospital,12,1:18,FASTCAT,69,37.339455,-120.46875
        299,Tri-College/Mercy Hospital,12,1:25,FASTCAT,88,37.339455,-120.46875
        300,Tri-College/Mercy Hospital,12,1:52,FASTCAT,107,37.339455,-120.46875
        301,Tri-College/Mercy Hospital,12,13:59,FASTCAT,126,37.339455,-120.46875
        302,Tri-College/Mercy Hospital,12,15:26,FASTCAT,145,37.339455,-120.46875
        303,Tri-College/Mercy Hospital,12,16:33,FASTCAT,164,37.339455,-120.46875
        304,Tri-College/Mercy Hospital,12,18:00,FASTCAT,183,37.339455,-120.46875
        305,Tri-College/Mercy Hospital,12,19:07,FASTCAT,202,37.339455,-120.46875
        306,Tri-College/Mercy Hospital,12,20:14,FASTCAT,221,37.339455,-120.46875
        307,Tri-College/Mercy Hospital,12,21:21,FASTCAT,240,37.339455,-120.46875
        308,Tri-College/Mercy Hospital,12,22:48,FASTCAT,259,37.339455,-120.46875
        309,Yosemite Ave & Cordova Ave(Merced County Physicians),13,6:40,FASTCAT,13,37.332089,-120.4625951
        310,Yosemite Ave & Cordova Ave(Merced County Physicians),13,8:07,FASTCAT,32,37.332089,-120.4625951
        311,Yosemite Ave & Cordova Ave(Merced County Physicians),13,9:14,FASTCAT,51,37.332089,-120.4625951
        312,Yosemite Ave & Cordova Ave(Merced County Physicians),13,1:21,FASTCAT,70,37.332089,-120.4625951
        313,Yosemite Ave & Cordova Ave(Merced County Physicians),13,1:28,FASTCAT,89,37.332089,-120.4625951
        314,Yosemite Ave & Cordova Ave(Merced County Physicians),13,1:55,FASTCAT,108,37.332089,-120.4625951
        315,Yosemite Ave & Cordova Ave(Merced County Physicians),13,14:02,FASTCAT,127,37.332089,-120.4625951
        316,Yosemite Ave & Cordova Ave(Merced County Physicians),13,15:29,FASTCAT,146,37.332089,-120.4625951
        317,Yosemite Ave & Cordova Ave(Merced County Physicians),13,16:36,FASTCAT,165,37.332089,-120.4625951
        318,Yosemite Ave & Cordova Ave(Merced County Physicians),13,18:03,FASTCAT,184,37.332089,-120.4625951
        319,Yosemite Ave & Cordova Ave(Merced County Physicians),13,19:10,FASTCAT,203,37.332089,-120.4625951
        320,Yosemite Ave & Cordova Ave(Merced County Physicians),13,20:17,FASTCAT,222,37.332089,-120.4625951
        321,Yosemite Ave & Cordova Ave(Merced County Physicians),13,21:24,FASTCAT,241,37.332089,-120.4625951
        322,Yosemite Ave & Cordova Ave(Merced County Physicians),13,22:51,FASTCAT,260,37.332089,-120.4625951
        323,University Surgery Center,14,6:43,FASTCAT,14,37.332207,-120.451404
        324,University Surgery Center,14,8:10,FASTCAT,33,37.332207,-120.451404
        325,University Surgery Center,14,9:17,FASTCAT,52,37.332207,-120.451404
        326,University Surgery Center,14,1:24,FASTCAT,71,37.332207,-120.451404
        327,University Surgery Center,14,1:31,FASTCAT,90,37.332207,-120.451404
        328,University Surgery Center,14,1:58,FASTCAT,109,37.332207,-120.451404
        329,University Surgery Center,14,14:05,FASTCAT,128,37.332207,-120.451404
        330,University Surgery Center,14,15:32,FASTCAT,147,37.332207,-120.451404
        331,University Surgery Center,14,16:39,FASTCAT,166,37.332207,-120.451404
        332,University Surgery Center,14,18:06,FASTCAT,185,37.332207,-120.451404
        333,University Surgery Center,14,19:13,FASTCAT,204,37.332207,-120.451404
        334,University Surgery Center,14,20:20,FASTCAT,223,37.332207,-120.451404
        335,University Surgery Center,14,21:27,FASTCAT,242,37.332207,-120.451404
        336,University Surgery Center,14,22:54,FASTCAT,261,37.332207,-120.451404
        337,Yosemite Church (McKee Rd.),15,6:43,FASTCAT,15,37.332027,"-120,442,899"
        338,Yosemite Church (McKee Rd.),15,8:10,FASTCAT,34,37.332027,"-120,442,899"
        339,Yosemite Church (McKee Rd.),15,9:17,FASTCAT,53,37.332027,"-120,442,899"
        340,Yosemite Church (McKee Rd.),15,1:24,FASTCAT,72,37.332027,"-120,442,899"
        341,Yosemite Church (McKee Rd.),15,1:31,FASTCAT,91,37.332027,"-120,442,899"
        342,Yosemite Church (McKee Rd.),15,1:58,FASTCAT,110,37.332027,"-120,442,899"
        343,Yosemite Church (McKee Rd.),15,14:05,FASTCAT,129,37.332027,"-120,442,899"
        344,Yosemite Church (McKee Rd.),15,15:32,FASTCAT,148,37.332027,"-120,442,899"
        345,Yosemite Church (McKee Rd.),15,16:39,FASTCAT,167,37.332027,"-120,442,899"
        346,Yosemite Church (McKee Rd.),15,18:06,FASTCAT,186,37.332027,"-120,442,899"
        347,Yosemite Church (McKee Rd.),15,19:13,FASTCAT,205,37.332027,"-120,442,899"
        348,Yosemite Church (McKee Rd.),15,20:20,FASTCAT,224,37.332027,"-120,442,899"
        349,Yosemite Church (McKee Rd.),15,21:27,FASTCAT,243,37.332027,"-120,442,899"
        350,Yosemite Church (McKee Rd.),15,22:54,FASTCAT,262,37.332027,"-120,442,899"
        351,Moraga Subdivision,16,6:45,FASTCAT,16,37.332027,-120.438567
        352,Moraga Subdivision,16,8:12,FASTCAT,35,37.332027,-120.438567
        353,Moraga Subdivision,16,9:19,FASTCAT,54,37.332027,-120.438567
        354,Moraga Subdivision,16,1:26,FASTCAT,73,37.332027,-120.438567
        355,Moraga Subdivision,16,1:33,FASTCAT,92,37.332027,-120.438567
        356,Moraga Subdivision,16,1:00,FASTCAT,111,37.332027,-120.438567
        357,Moraga Subdivision,16,14:07,FASTCAT,130,37.332027,-120.438567
        358,Moraga Subdivision,16,15:34,FASTCAT,149,37.332027,-120.438567
        359,Moraga Subdivision,16,16:41,FASTCAT,168,37.332027,-120.438567
        360,Moraga Subdivision,16,18:08,FASTCAT,187,37.332027,-120.438567
        361,Moraga Subdivision,16,19:15,FASTCAT,206,37.332027,-120.438567
        362,Moraga Subdivision,16,20:22,FASTCAT,225,37.332027,-120.438567
        363,Moraga Subdivision,16,21:29,FASTCAT,244,37.332027,-120.438567
        364,Moraga Subdivision,16,22:56,FASTCAT,263,37.332027,-120.438567
        365,Mammoth Lakes Rd.,17,6:50,FASTCAT,17,37.363256,-120.429404
        366,Mammoth Lakes Rd.,17,8:17,FASTCAT,36,37.363256,-120.429404
        367,Mammoth Lakes Rd.,17,9:24,FASTCAT,55,37.363256,-120.429404
        368,Mammoth Lakes Rd.,17,1:31,FASTCAT,74,37.363256,-120.429404
        369,Mammoth Lakes Rd.,17,1:38,FASTCAT,93,37.363256,-120.429404
        370,Mammoth Lakes Rd.,17,13:05,FASTCAT,112,37.363256,-120.429404
        371,Mammoth Lakes Rd.,17,14:12,FASTCAT,131,37.363256,-120.429404
        372,Mammoth Lakes Rd.,17,15:39,FASTCAT,150,37.363256,-120.429404
        373,Mammoth Lakes Rd.,17,16:46,FASTCAT,169,37.363256,-120.429404
        374,Mammoth Lakes Rd.,17,18:13,FASTCAT,188,37.363256,-120.429404
        375,Mammoth Lakes Rd.,17,19:20,FASTCAT,207,37.363256,-120.429404
        376,Mammoth Lakes Rd.,17,20:27,FASTCAT,226,37.363256,-120.429404
        377,Mammoth Lakes Rd.,17,21:34,FASTCAT,245,37.363256,-120.429404
        378,Mammoth Lakes Rd.,17,23:01,FASTCAT,264,37.363256,-120.429404
        379,Student Activities & Athletic Center,18,6:55,FASTCAT,18,37.3654274,-120.4262007
        380,Student Activities & Athletic Center,18,8:22,FASTCAT,37,37.3654274,-120.4262007
        381,Student Activities & Athletic Center,18,9:29,FASTCAT,56,37.3654274,-120.4262007
        382,Student Activities & Athletic Center,18,1:36,FASTCAT,75,37.3654274,-120.4262007
        383,Student Activities & Athletic Center,18,1:43,FASTCAT,94,37.3654274,-120.4262007
        384,Student Activities & Athletic Center,18,13:10,FASTCAT,113,37.3654274,-120.4262007
        385,Student Activities & Athletic Center,18,14:17,FASTCAT,132,37.3654274,-120.4262007
        386,Student Activities & Athletic Center,18,15:44,FASTCAT,151,37.3654274,-120.4262007
        387,Student Activities & Athletic Center,18,16:51,FASTCAT,170,37.3654274,-120.4262007
        388,Student Activities & Athletic Center,18,18:18,FASTCAT,189,37.3654274,-120.4262007
        389,Student Activities & Athletic Center,18,19:25,FASTCAT,208,37.3654274,-120.4262007
        390,Student Activities & Athletic Center,18,20:32,FASTCAT,227,37.3654274,-120.4262007
        391,Student Activities & Athletic Center,18,21:39,FASTCAT,246,37.3654274,-120.4262007
        392,Student Activities & Athletic Center,18,23:06,FASTCAT,265,37.3654274,-120.4262007
        393,Emigrant Pass at Scholars Lane,19,6:57,FASTCAT,19,37.3637409,-120.4305694
        394,Emigrant Pass at Scholars Lane,19,8:24,FASTCAT,38,37.3637409,-120.4305694
        395,Emigrant Pass at Scholars Lane,19,9:31,FASTCAT,57,37.3637409,-120.4305694
        396,Emigrant Pass at Scholars Lane,19,1:38,FASTCAT,76,37.3637409,-120.4305694
        397,Emigrant Pass at Scholars Lane,19,1:45,FASTCAT,95,37.3637409,-120.4305694
        398,Emigrant Pass at Scholars Lane,19,13:12,FASTCAT,114,37.3637409,-120.4305694
        399,Emigrant Pass at Scholars Lane,19,14:19,FASTCAT,133,37.3637409,-120.4305694
        400,Emigrant Pass at Scholars Lane,19,15:46,FASTCAT,152,37.3637409,-120.4305694
        401,Emigrant Pass at Scholars Lane,19,16:53,FASTCAT,171,37.3637409,-120.4305694
        402,Emigrant Pass at Scholars Lane,19,18:20,FASTCAT,190,37.3637409,-120.4305694
        403,Emigrant Pass at Scholars Lane,19,19:27,FASTCAT,209,37.3637409,-120.4305694
        404,Emigrant Pass at Scholars Lane,19,20:34,FASTCAT,228,37.3637409,-120.4305694
        405,Emigrant Pass at Scholars Lane,19,21:41,FASTCAT,247,37.3637409,-120.4305694
        406,Emigrant Pass at Scholars Lane,19,23:08,FASTCAT,266,37.3637409,-120.4305694
        407,Granville Apartments,1,5:45,C1,1,37.315222,-120.502972
        408,Granville Apartments,1,6:25,C1,19,37.315222,-120.502972
        409,Granville Apartments,1,7:04,C1,37,37.315222,-120.502972
        410,Granville Apartments,1,7:44,C1,55,37.315222,-120.502972
        411,Granville Apartments,1,8:43,C1,73,37.315222,-120.502972
        412,Granville Apartments,1,9:23,C1,91,37.315222,-120.502972
        413,Granville Apartments,1,10:02,C1,109,37.315222,-120.502972
        414,Granville Apartments,1,10:42,C1,127,37.315222,-120.502972
        415,Granville Apartments,1,11:21,C1,145,37.315222,-120.502972
        416,Granville Apartments,1,12:01,C1,163,37.315222,-120.502972
        417,Granville Apartments,1,13:00,C1,181,37.315222,-120.502972
        418,Granville Apartments,1,13:40,C1,199,37.315222,-120.502972
        419,Granville Apartments,1,14:19,C1,217,37.315222,-120.502972
        420,Granville Apartments,1,14:59,C1,235,37.315222,-120.502972
        421,Granville Apartments,1,15:58,C1,253,37.315222,-120.502972
        422,Granville Apartments,1,16:38,C1,271,37.315222,-120.502972
        423,Granville Apartments,1,17:17,C1,289,37.315222,-120.502972
        424,Granville Apartments,1,17:57,C1,307,37.315222,-120.502972
        425,Granville Apartments,1,18:36,C1,325,37.315222,-120.502972
        426,Granville Apartments,1,19:16,C1,343,37.315222,-120.502972
        427,Granville Apartments,1,20:15,C1,361,37.315222,-120.502972
        428,Granville Apartments,1,20:55,C1,379,37.315222,-120.502972
        429,Granville Apartments,1,21:34,C1,397,37.315222,-120.502972
        430,Granville Apartments,1,22:14,C1,415,37.315222,-120.502972
        431,Granville Apartments,1,23:28,C1,433,37.315222,-120.502972
        432,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,5:50,C1,2,37.316995,-120.499007
        433,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,6:30,C1,20,37.316995,-120.499007
        434,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,7:09,C1,38,37.316995,-120.499007
        435,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,7:49,C1,56,37.316995,-120.499007
        436,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,8:48,C1,74,37.316995,-120.499007
        437,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,9:28,C1,92,37.316995,-120.499007
        438,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,10:07,C1,110,37.316995,-120.499007
        439,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,10:47,C1,128,37.316995,-120.499007
        440,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,11:26,C1,146,37.316995,-120.499007
        441,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,12:06,C1,164,37.316995,-120.499007
        442,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,13:05,C1,182,37.316995,-120.499007
        443,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,13:45,C1,200,37.316995,-120.499007
        444,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,14:24,C1,218,37.316995,-120.499007
        445,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,15:04,C1,236,37.316995,-120.499007
        446,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,16:03,C1,254,37.316995,-120.499007
        447,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,16:43,C1,272,37.316995,-120.499007
        448,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,17:22,C1,290,37.316995,-120.499007
        449,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,18:02,C1,308,37.316995,-120.499007
        450,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,18:41,C1,326,37.316995,-120.499007
        451,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,19:21,C1,344,37.316995,-120.499007
        452,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,20:20,C1,362,37.316995,-120.499007
        453,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,21:00,C1,380,37.316995,-120.499007
        454,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,21:39,C1,398,37.316995,-120.499007
        455,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,22:19,C1,416,37.316995,-120.499007
        456,Walmart on Loughborough Dr. (Pullout past Mistwood Dr.),2,23:33,C1,434,37.316995,-120.499007
        457,Meadows Ave & Olivewood Dr. (Food Maxx),3,5:52,C1,3,37.318107,-120.490619
        458,Meadows Ave & Olivewood Dr. (Food Maxx),3,6:32,C1,21,37.318107,-120.490619
        459,Meadows Ave & Olivewood Dr. (Food Maxx),3,7:11,C1,39,37.318107,-120.490619
        460,Meadows Ave & Olivewood Dr. (Food Maxx),3,7:51,C1,57,37.318107,-120.490619
        461,Meadows Ave & Olivewood Dr. (Food Maxx),3,8:50,C1,75,37.318107,-120.490619
        462,Meadows Ave & Olivewood Dr. (Food Maxx),3,9:30,C1,93,37.318107,-120.490619
        463,Meadows Ave & Olivewood Dr. (Food Maxx),3,10:09,C1,111,37.318107,-120.490619
        464,Meadows Ave & Olivewood Dr. (Food Maxx),3,10:49,C1,129,37.318107,-120.490619
        465,Meadows Ave & Olivewood Dr. (Food Maxx),3,11:28,C1,147,37.318107,-120.490619
        466,Meadows Ave & Olivewood Dr. (Food Maxx),3,12:08,C1,165,37.318107,-120.490619
        467,Meadows Ave & Olivewood Dr. (Food Maxx),3,13:07,C1,183,37.318107,-120.490619
        468,Meadows Ave & Olivewood Dr. (Food Maxx),3,13:47,C1,201,37.318107,-120.490619
        469,Meadows Ave & Olivewood Dr. (Food Maxx),3,14:26,C1,219,37.318107,-120.490619
        470,Meadows Ave & Olivewood Dr. (Food Maxx),3,15:06,C1,237,37.318107,-120.490619
        471,Meadows Ave & Olivewood Dr. (Food Maxx),3,16:05,C1,255,37.318107,-120.490619
        472,Meadows Ave & Olivewood Dr. (Food Maxx),3,16:45,C1,273,37.318107,-120.490619
        473,Meadows Ave & Olivewood Dr. (Food Maxx),3,17:24,C1,291,37.318107,-120.490619
        474,Meadows Ave & Olivewood Dr. (Food Maxx),3,18:04,C1,309,37.318107,-120.490619
        475,Meadows Ave & Olivewood Dr. (Food Maxx),3,18:43,C1,327,37.318107,-120.490619
        476,Meadows Ave & Olivewood Dr. (Food Maxx),3,19:23,C1,345,37.318107,-120.490619
        477,Meadows Ave & Olivewood Dr. (Food Maxx),3,20:22,C1,363,37.318107,-120.490619
        478,Meadows Ave & Olivewood Dr. (Food Maxx),3,21:02,C1,381,37.318107,-120.490619
        479,Meadows Ave & Olivewood Dr. (Food Maxx),3,21:41,C1,399,37.318107,-120.490619
        480,Meadows Ave & Olivewood Dr. (Food Maxx),3,22:21,C1,417,37.318107,-120.490619
        481,Meadows Ave & Olivewood Dr. (Food Maxx),3,23:35,C1,435,37.318107,-120.490619
        482,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,6:01,C1,5,37.315778,-120.469213
        483,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,6:41,C1,23,37.315778,-120.469213
        484,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,7:20,C1,41,37.315778,-120.469213
        485,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,8:00,C1,59,37.315778,-120.469213
        486,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,8:59,C1,77,37.315778,-120.469213
        487,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,9:39,C1,95,37.315778,-120.469213
        488,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,10:18,C1,113,37.315778,-120.469213
        489,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,10:58,C1,131,37.315778,-120.469213
        490,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,11:37,C1,149,37.315778,-120.469213
        491,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,12:17,C1,167,37.315778,-120.469213
        492,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,13:16,C1,185,37.315778,-120.469213
        493,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,13:56,C1,203,37.315778,-120.469213
        494,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,14:35,C1,221,37.315778,-120.469213
        495,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,15:15,C1,239,37.315778,-120.469213
        496,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,16:14,C1,257,37.315778,-120.469213
        497,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,16:54,C1,275,37.315778,-120.469213
        498,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,17:33,C1,293,37.315778,-120.469213
        499,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,18:13,C1,311,37.315778,-120.469213
        500,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,18:52,C1,329,37.315778,-120.469213
        501,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,19:32,C1,347,37.315778,-120.469213
        502,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,20:31,C1,365,37.315778,-120.469213
        503,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,21:11,C1,383,37.315778,-120.469213
        504,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,21:50,C1,401,37.315778,-120.469213
        505,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,22:30,C1,419,37.315778,-120.469213
        506,"G St. & W. Alexander Ave. (Bus Stop on ""G"" by Gas Station)",5,23:44,C1,437,37.315778,-120.469213
        507,Rite Aid/Walgreens,6,6:03,C1,6,37.319633,-120.469128
        508,Rite Aid/Walgreens,6,6:43,C1,24,37.319633,-120.469128
        509,Rite Aid/Walgreens,6,7:22,C1,42,37.319633,-120.469128
        510,Rite Aid/Walgreens,6,8:02,C1,60,37.319633,-120.469128
        511,Rite Aid/Walgreens,6,9:01,C1,78,37.319633,-120.469128
        512,Rite Aid/Walgreens,6,9:41,C1,96,37.319633,-120.469128
        513,Rite Aid/Walgreens,6,10:20,C1,114,37.319633,-120.469128
        514,Rite Aid/Walgreens,6,11:00,C1,132,37.319633,-120.469128
        515,Rite Aid/Walgreens,6,11:39,C1,150,37.319633,-120.469128
        516,Rite Aid/Walgreens,6,12:19,C1,168,37.319633,-120.469128
        517,Rite Aid/Walgreens,6,13:18,C1,186,37.319633,-120.469128
        518,Rite Aid/Walgreens,6,13:58,C1,204,37.319633,-120.469128
        519,Rite Aid/Walgreens,6,14:37,C1,222,37.319633,-120.469128
        520,Rite Aid/Walgreens,6,15:17,C1,240,37.319633,-120.469128
        521,Rite Aid/Walgreens,6,16:16,C1,258,37.319633,-120.469128
        522,Rite Aid/Walgreens,6,16:56,C1,276,37.319633,-120.469128
        523,Rite Aid/Walgreens,6,17:35,C1,294,37.319633,-120.469128
        524,Rite Aid/Walgreens,6,18:15,C1,312,37.319633,-120.469128
        525,Rite Aid/Walgreens,6,18:54,C1,330,37.319633,-120.469128
        526,Rite Aid/Walgreens,6,19:34,C1,348,37.319633,-120.469128
        527,Rite Aid/Walgreens,6,20:33,C1,366,37.319633,-120.469128
        528,Rite Aid/Walgreens,6,21:13,C1,384,37.319633,-120.469128
        529,Rite Aid/Walgreens,6,21:52,C1,402,37.319633,-120.469128
        530,Rite Aid/Walgreens,6,22:32,C1,420,37.319633,-120.469128
        531,Rite Aid/Walgreens,6,23:46,C1,438,37.319633,-120.469128
        532,"El Portal & ""G"" Street (Bus stop on ""G"")",7,6:05,C1,7,37.327045,-120.469015
        533,"El Portal & ""G"" Street (Bus stop on ""G"")",7,6:45,C1,25,37.327045,-120.469015
        534,"El Portal & ""G"" Street (Bus stop on ""G"")",7,7:24,C1,43,37.327045,-120.469015
        535,"El Portal & ""G"" Street (Bus stop on ""G"")",7,8:04,C1,61,37.327045,-120.469015
        536,"El Portal & ""G"" Street (Bus stop on ""G"")",7,9:03,C1,79,37.327045,-120.469015
        537,"El Portal & ""G"" Street (Bus stop on ""G"")",7,9:43,C1,97,37.327045,-120.469015
        538,"El Portal & ""G"" Street (Bus stop on ""G"")",7,10:22,C1,115,37.327045,-120.469015
        539,"El Portal & ""G"" Street (Bus stop on ""G"")",7,11:02,C1,133,37.327045,-120.469015
        540,"El Portal & ""G"" Street (Bus stop on ""G"")",7,11:41,C1,151,37.327045,-120.469015
        541,"El Portal & ""G"" Street (Bus stop on ""G"")",7,12:21,C1,169,37.327045,-120.469015
        542,"El Portal & ""G"" Street (Bus stop on ""G"")",7,13:20,C1,187,37.327045,-120.469015
        543,"El Portal & ""G"" Street (Bus stop on ""G"")",7,14:00,C1,205,37.327045,-120.469015
        544,"El Portal & ""G"" Street (Bus stop on ""G"")",7,14:39,C1,223,37.327045,-120.469015
        545,"El Portal & ""G"" Street (Bus stop on ""G"")",7,15:19,C1,241,37.327045,-120.469015
        546,"El Portal & ""G"" Street (Bus stop on ""G"")",7,16:18,C1,259,37.327045,-120.469015
        547,"El Portal & ""G"" Street (Bus stop on ""G"")",7,16:58,C1,277,37.327045,-120.469015
        548,"El Portal & ""G"" Street (Bus stop on ""G"")",7,17:37,C1,295,37.327045,-120.469015
        549,"El Portal & ""G"" Street (Bus stop on ""G"")",7,18:17,C1,313,37.327045,-120.469015
        550,"El Portal & ""G"" Street (Bus stop on ""G"")",7,18:56,C1,331,37.327045,-120.469015
        551,"El Portal & ""G"" Street (Bus stop on ""G"")",7,19:36,C1,349,37.327045,-120.469015
        552,"El Portal & ""G"" Street (Bus stop on ""G"")",7,20:35,C1,367,37.327045,-120.469015
        553,"El Portal & ""G"" Street (Bus stop on ""G"")",7,21:15,C1,385,37.327045,-120.469015
        554,"El Portal & ""G"" Street (Bus stop on ""G"")",7,21:54,C1,403,37.327045,-120.469015
        555,"El Portal & ""G"" Street (Bus stop on ""G"")",7,22:34,C1,421,37.327045,-120.469015
        556,"El Portal & ""G"" Street (Bus stop on ""G"")",7,23:48,C1,439,37.327045,-120.469015
        557,Mercy Hospital/Tri-College,8,6:08,C1,8,37.339455,-120.46875
        558,Mercy Hospital/Tri-College,8,6:48,C1,26,37.339455,-120.46875
        559,Mercy Hospital/Tri-College,8,7:27,C1,44,37.339455,-120.46875
        560,Mercy Hospital/Tri-College,8,8:07,C1,62,37.339455,-120.46875
        561,Mercy Hospital/Tri-College,8,9:06,C1,80,37.339455,-120.46875
        562,Mercy Hospital/Tri-College,8,9:46,C1,98,37.339455,-120.46875
        563,Mercy Hospital/Tri-College,8,10:25,C1,116,37.339455,-120.46875
        564,Mercy Hospital/Tri-College,8,11:05,C1,134,37.339455,-120.46875
        565,Mercy Hospital/Tri-College,8,11:44,C1,152,37.339455,-120.46875
        566,Mercy Hospital/Tri-College,8,12:24,C1,170,37.339455,-120.46875
        567,Mercy Hospital/Tri-College,8,13:23,C1,188,37.339455,-120.46875
        568,Mercy Hospital/Tri-College,8,14:03,C1,206,37.339455,-120.46875
        569,Mercy Hospital/Tri-College,8,14:42,C1,224,37.339455,-120.46875
        570,Mercy Hospital/Tri-College,8,15:22,C1,242,37.339455,-120.46875
        571,Mercy Hospital/Tri-College,8,16:21,C1,260,37.339455,-120.46875
        572,Mercy Hospital/Tri-College,8,17:01,C1,278,37.339455,-120.46875
        573,Mercy Hospital/Tri-College,8,17:40,C1,296,37.339455,-120.46875
        574,Mercy Hospital/Tri-College,8,18:20,C1,314,37.339455,-120.46875
        575,Mercy Hospital/Tri-College,8,18:59,C1,332,37.339455,-120.46875
        576,Mercy Hospital/Tri-College,8,19:39,C1,350,37.339455,-120.46875
        577,Mercy Hospital/Tri-College,8,20:38,C1,368,37.339455,-120.46875
        578,Mercy Hospital/Tri-College,8,21:18,C1,386,37.339455,-120.46875
        579,Mercy Hospital/Tri-College,8,21:57,C1,404,37.339455,-120.46875
        580,Mercy Hospital/Tri-College,8,22:37,C1,422,37.339455,-120.46875
        581,Mercy Hospital/Tri-College,8,23:51,C1,440,37.339455,-120.46875
        582,Bellevue Ranch on Arrow Wood Dr.,9,6:15,C1,9,37.3526891,-120.4781953
        583,Bellevue Ranch on Arrow Wood Dr.,9,6:55,C1,27,37.3526891,-120.4781953
        584,Bellevue Ranch on Arrow Wood Dr.,9,7:34,C1,45,37.3526891,-120.4781953
        585,Bellevue Ranch on Arrow Wood Dr.,9,8:14,C1,63,37.3526891,-120.4781953
        586,Bellevue Ranch on Arrow Wood Dr.,9,9:13,C1,81,37.3526891,-120.4781953
        587,Bellevue Ranch on Arrow Wood Dr.,9,9:53,C1,99,37.3526891,-120.4781953
        588,Bellevue Ranch on Arrow Wood Dr.,9,10:32,C1,117,37.3526891,-120.4781953
        589,Bellevue Ranch on Arrow Wood Dr.,9,11:12,C1,135,37.3526891,-120.4781953
        590,Bellevue Ranch on Arrow Wood Dr.,9,11:51,C1,153,37.3526891,-120.4781953
        591,Bellevue Ranch on Arrow Wood Dr.,9,12:31,C1,171,37.3526891,-120.4781953
        592,Bellevue Ranch on Arrow Wood Dr.,9,13:30,C1,189,37.3526891,-120.4781953
        593,Bellevue Ranch on Arrow Wood Dr.,9,14:10,C1,207,37.3526891,-120.4781953
        594,Bellevue Ranch on Arrow Wood Dr.,9,14:49,C1,225,37.3526891,-120.4781953
        595,Bellevue Ranch on Arrow Wood Dr.,9,15:29,C1,243,37.3526891,-120.4781953
        596,Bellevue Ranch on Arrow Wood Dr.,9,16:28,C1,261,37.3526891,-120.4781953
        597,Bellevue Ranch on Arrow Wood Dr.,9,17:08,C1,279,37.3526891,-120.4781953
        598,Bellevue Ranch on Arrow Wood Dr.,9,17:47,C1,297,37.3526891,-120.4781953
        599,Bellevue Ranch on Arrow Wood Dr.,9,18:27,C1,315,37.3526891,-120.4781953
        600,Bellevue Ranch on Arrow Wood Dr.,9,19:06,C1,333,37.3526891,-120.4781953
        601,Bellevue Ranch on Arrow Wood Dr.,9,19:46,C1,351,37.3526891,-120.4781953
        602,Bellevue Ranch on Arrow Wood Dr.,9,20:45,C1,369,37.3526891,-120.4781953
        603,Bellevue Ranch on Arrow Wood Dr.,9,21:25,C1,387,37.3526891,-120.4781953
        604,Bellevue Ranch on Arrow Wood Dr.,9,22:04,C1,405,37.3526891,-120.4781953
        605,Bellevue Ranch on Arrow Wood Dr.,9,22:44,C1,423,37.3526891,-120.4781953
        606,Bellevue Ranch on Arrow Wood Dr.,9,23:58,C1,441,37.3526891,-120.4781953
        607,Mammoth Lakes Rd.,10,6:22,C1,10,37.363256,-120.429404
        608,Mammoth Lakes Rd.,10,7:02,C1,28,37.363256,-120.429404
        609,Mammoth Lakes Rd.,10,7:41,C1,46,37.363256,-120.429404
        610,Mammoth Lakes Rd.,10,8:21,C1,64,37.363256,-120.429404
        611,Mammoth Lakes Rd.,10,9:20,C1,82,37.363256,-120.429404
        612,Mammoth Lakes Rd.,10,10:00,C1,100,37.363256,-120.429404
        613,Mammoth Lakes Rd.,10,10:39,C1,118,37.363256,-120.429404
        614,Mammoth Lakes Rd.,10,11:19,C1,136,37.363256,-120.429404
        615,Mammoth Lakes Rd.,10,11:58,C1,154,37.363256,-120.429404
        616,Mammoth Lakes Rd.,10,12:38,C1,172,37.363256,-120.429404
        617,Mammoth Lakes Rd.,10,13:37,C1,190,37.363256,-120.429404
        618,Mammoth Lakes Rd.,10,14:17,C1,208,37.363256,-120.429404
        619,Mammoth Lakes Rd.,10,14:56,C1,226,37.363256,-120.429404
        620,Mammoth Lakes Rd.,10,15:36,C1,244,37.363256,-120.429404
        621,Mammoth Lakes Rd.,10,16:35,C1,262,37.363256,-120.429404
        622,Mammoth Lakes Rd.,10,17:15,C1,280,37.363256,-120.429404
        623,Mammoth Lakes Rd.,10,17:54,C1,298,37.363256,-120.429404
        624,Mammoth Lakes Rd.,10,18:34,C1,316,37.363256,-120.429404
        625,Mammoth Lakes Rd.,10,19:13,C1,334,37.363256,-120.429404
        626,Mammoth Lakes Rd.,10,19:53,C1,352,37.363256,-120.429404
        627,Mammoth Lakes Rd.,10,20:52,C1,370,37.363256,-120.429404
        628,Mammoth Lakes Rd.,10,21:32,C1,388,37.363256,-120.429404
        629,Mammoth Lakes Rd.,10,22:11,C1,406,37.363256,-120.429404
        630,Mammoth Lakes Rd.,10,22:51,C1,424,37.363256,-120.429404
        631,Mammoth Lakes Rd.,10,0:05,C1,442,37.363256,-120.429404
        632,Student Activities & Athletics Center,11,6:27,C1,11,37.3654274,-120.4262007
        633,Student Activities & Athletics Center,11,7:07,C1,29,37.3654274,-120.4262007
        634,Student Activities & Athletics Center,11,8:06,C1,47,37.3654274,-120.4262007
        635,Student Activities & Athletics Center,11,8:46,C1,65,37.3654274,-120.4262007
        636,Student Activities & Athletics Center,11,9:25,C1,83,37.3654274,-120.4262007
        637,Student Activities & Athletics Center,11,10:05,C1,101,37.3654274,-120.4262007
        638,Student Activities & Athletics Center,11,10:44,C1,119,37.3654274,-120.4262007
        639,Student Activities & Athletics Center,11,11:24,C1,137,37.3654274,-120.4262007
        640,Student Activities & Athletics Center,11,12:23,C1,155,37.3654274,-120.4262007
        641,Student Activities & Athletics Center,11,13:03,C1,173,37.3654274,-120.4262007
        642,Student Activities & Athletics Center,11,13:42,C1,191,37.3654274,-120.4262007
        643,Student Activities & Athletics Center,11,14:22,C1,209,37.3654274,-120.4262007
        644,Student Activities & Athletics Center,11,15:21,C1,227,37.3654274,-120.4262007
        645,Student Activities & Athletics Center,11,16:01,C1,245,37.3654274,-120.4262007
        646,Student Activities & Athletics Center,11,16:40,C1,263,37.3654274,-120.4262007
        647,Student Activities & Athletics Center,11,17:20,C1,281,37.3654274,-120.4262007
        648,Student Activities & Athletics Center,11,17:59,C1,299,37.3654274,-120.4262007
        649,Student Activities & Athletics Center,11,18:39,C1,317,37.3654274,-120.4262007
        650,Student Activities & Athletics Center,11,19:38,C1,335,37.3654274,-120.4262007
        651,Student Activities & Athletics Center,11,20:18,C1,353,37.3654274,-120.4262007
        652,Student Activities & Athletics Center,11,20:57,C1,371,37.3654274,-120.4262007
        653,Student Activities & Athletics Center,11,21:37,C1,389,37.3654274,-120.4262007
        654,Student Activities & Athletics Center,11,22:51,C1,407,37.3654274,-120.4262007
        655,Student Activities & Athletics Center,11,22:56,C1,425,37.3654274,-120.4262007
        656,Student Activities & Athletics Center,11,0:10,C1,443,37.3654274,-120.4262007
        657,Emigrant Pass at Scholars Lane,12,6:29,C1,12,37.3637409,-120.4305694
        658,Emigrant Pass at Scholars Lane,12,7:09,C1,30,37.3637409,-120.4305694
        659,Emigrant Pass at Scholars Lane,12,8:08,C1,48,37.3637409,-120.4305694
        660,Emigrant Pass at Scholars Lane,12,8:48,C1,66,37.3637409,-120.4305694
        661,Emigrant Pass at Scholars Lane,12,9:27,C1,84,37.3637409,-120.4305694
        662,Emigrant Pass at Scholars Lane,12,10:07,C1,102,37.3637409,-120.4305694
        663,Emigrant Pass at Scholars Lane,12,10:46,C1,120,37.3637409,-120.4305694
        664,Emigrant Pass at Scholars Lane,12,11:26,C1,138,37.3637409,-120.4305694
        665,Emigrant Pass at Scholars Lane,12,12:25,C1,156,37.3637409,-120.4305694
        666,Emigrant Pass at Scholars Lane,12,13:05,C1,174,37.3637409,-120.4305694
        667,Emigrant Pass at Scholars Lane,12,13:44,C1,192,37.3637409,-120.4305694
        668,Emigrant Pass at Scholars Lane,12,14:24,C1,210,37.3637409,-120.4305694
        669,Emigrant Pass at Scholars Lane,12,15:23,C1,228,37.3637409,-120.4305694
        670,Emigrant Pass at Scholars Lane,12,16:03,C1,246,37.3637409,-120.4305694
        671,Emigrant Pass at Scholars Lane,12,16:42,C1,264,37.3637409,-120.4305694
        672,Emigrant Pass at Scholars Lane,12,17:22,C1,282,37.3637409,-120.4305694
        673,Emigrant Pass at Scholars Lane,12,18:01,C1,300,37.3637409,-120.4305694
        674,Emigrant Pass at Scholars Lane,12,18:41,C1,318,37.3637409,-120.4305694
        675,Emigrant Pass at Scholars Lane,12,19:40,C1,336,37.3637409,-120.4305694
        676,Emigrant Pass at Scholars Lane,12,20:20,C1,354,37.3637409,-120.4305694
        677,Emigrant Pass at Scholars Lane,12,20:59,C1,372,37.3637409,-120.4305694
        678,Emigrant Pass at Scholars Lane,12,21:39,C1,390,37.3637409,-120.4305694
        679,Emigrant Pass at Scholars Lane,12,22:53,C1,408,37.3637409,-120.4305694
        680,Emigrant Pass at Scholars Lane,12,12:00,C1,426,37.3637409,-120.4305694
        681,Emigrant Pass at Scholars Lane,12,0:12,C1,444,37.3637409,-120.4305694
        682,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,6:36,C1,13,37.339455,-120.46875
        683,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,7:16,C1,31,37.339455,-120.46875
        684,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,8:15,C1,49,37.339455,-120.46875
        685,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,8:55,C1,67,37.339455,-120.46875
        686,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,9:34,C1,85,37.339455,-120.46875
        687,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,10:14,C1,103,37.339455,-120.46875
        688,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,10:53,C1,121,37.339455,-120.46875
        689,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,11:33,C1,139,37.339455,-120.46875
        690,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,12:32,C1,157,37.339455,-120.46875
        691,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,13:12,C1,175,37.339455,-120.46875
        692,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,13:51,C1,193,37.339455,-120.46875
        693,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,14:31,C1,211,37.339455,-120.46875
        694,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,15:30,C1,229,37.339455,-120.46875
        695,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,16:10,C1,247,37.339455,-120.46875
        696,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,16:49,C1,265,37.339455,-120.46875
        697,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,17:29,C1,283,37.339455,-120.46875
        698,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,18:08,C1,301,37.339455,-120.46875
        699,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,18:48,C1,319,37.339455,-120.46875
        700,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,19:47,C1,337,37.339455,-120.46875
        701,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,20:27,C1,355,37.339455,-120.46875
        702,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,21:06,C1,373,37.339455,-120.46875
        703,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,21:46,C1,391,37.339455,-120.46875
        704,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,23:00,C1,409,37.339455,-120.46875
        705,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,12:00,C1,427,37.339455,-120.46875
        706,"Tri-College/Mercy (Bus stop on ""G"" next to Tri College)",13,0:19,C1,445,37.339455,-120.46875
        707,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,6:39,C1,14,37.327045,-120.469015
        708,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,7:19,C1,32,37.327045,-120.469015
        709,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,8:18,C1,50,37.327045,-120.469015
        710,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,8:58,C1,68,37.327045,-120.469015
        711,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,9:37,C1,86,37.327045,-120.469015
        712,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,10:17,C1,104,37.327045,-120.469015
        713,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,10:56,C1,122,37.327045,-120.469015
        714,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,11:36,C1,140,37.327045,-120.469015
        715,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,12:35,C1,158,37.327045,-120.469015
        716,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,13:15,C1,176,37.327045,-120.469015
        717,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,13:54,C1,194,37.327045,-120.469015
        718,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,14:34,C1,212,37.327045,-120.469015
        719,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,15:33,C1,230,37.327045,-120.469015
        720,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,16:13,C1,248,37.327045,-120.469015
        721,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,16:52,C1,266,37.327045,-120.469015
        722,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,17:32,C1,284,37.327045,-120.469015
        723,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,18:11,C1,302,37.327045,-120.469015
        724,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,18:51,C1,320,37.327045,-120.469015
        725,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,19:50,C1,338,37.327045,-120.469015
        726,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,20:30,C1,356,37.327045,-120.469015
        727,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,21:09,C1,374,37.327045,-120.469015
        728,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,21:49,C1,392,37.327045,-120.469015
        729,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,23:03,C1,410,37.327045,-120.469015
        730,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,12:00,C1,428,37.327045,-120.469015
        731,"El Portal Plaza & ""G"" Street (Bus stop on ""G"")",14,0:22,C1,446,37.315778,-120.469213
        732,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,6:41,C1,15,37.315778,-120.469213
        733,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,7:21,C1,33,37.315778,-120.469213
        734,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,8:20,C1,51,37.315778,-120.469213
        735,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,9:00,C1,69,37.315778,-120.469213
        736,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,9:39,C1,87,37.315778,-120.469213
        737,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,10:19,C1,105,37.315778,-120.469213
        738,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,10:58,C1,123,37.315778,-120.469213
        739,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,11:38,C1,141,37.315778,-120.469213
        740,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,12:37,C1,159,37.315778,-120.469213
        741,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,13:17,C1,177,37.315778,-120.469213
        742,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,13:56,C1,195,37.315778,-120.469213
        743,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,14:36,C1,213,37.315778,-120.469213
        744,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,15:35,C1,231,37.315778,-120.469213
        745,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,16:15,C1,249,37.315778,-120.469213
        746,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,16:54,C1,267,37.315778,-120.469213
        747,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,17:34,C1,285,37.315778,-120.469213
        748,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,18:13,C1,303,37.315778,-120.469213
        749,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,18:53,C1,321,37.315778,-120.469213
        750,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,19:52,C1,339,37.315778,-120.469213
        751,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,20:32,C1,357,37.315778,-120.469213
        752,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,21:11,C1,375,37.315778,-120.469213
        753,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,21:51,C1,393,37.315778,-120.469213
        754,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,23:05,C1,411,37.315778,-120.469213
        755,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,12:00,C1,429,37.315778,-120.469213
        756,G St. & W. Alexander Ave (Bus stop - Paul's Place),15,0:24,C1,447,37.315778,-120.469213
        757,Meadows Ave & Olivewood Dr. (Food Maxx),17,6:49,C1,17,37.318107,-120.490619
        758,Meadows Ave & Olivewood Dr. (Food Maxx),17,7:29,C1,35,37.318107,-120.490619
        759,Meadows Ave & Olivewood Dr. (Food Maxx),17,8:28,C1,53,37.318107,-120.490619
        760,Meadows Ave & Olivewood Dr. (Food Maxx),17,9:08,C1,71,37.318107,-120.490619
        761,Meadows Ave & Olivewood Dr. (Food Maxx),17,9:47,C1,89,37.318107,-120.490619
        762,Meadows Ave & Olivewood Dr. (Food Maxx),17,10:27,C1,107,37.318107,-120.490619
        763,Meadows Ave & Olivewood Dr. (Food Maxx),17,11:06,C1,125,37.318107,-120.490619
        764,Meadows Ave & Olivewood Dr. (Food Maxx),17,11:46,C1,143,37.318107,-120.490619
        765,Meadows Ave & Olivewood Dr. (Food Maxx),17,12:45,C1,161,37.318107,-120.490619
        766,Meadows Ave & Olivewood Dr. (Food Maxx),17,13:25,C1,179,37.318107,-120.490619
        767,Meadows Ave & Olivewood Dr. (Food Maxx),17,14:04,C1,197,37.318107,-120.490619
        768,Meadows Ave & Olivewood Dr. (Food Maxx),17,14:44,C1,215,37.318107,-120.490619
        769,Meadows Ave & Olivewood Dr. (Food Maxx),17,15:43,C1,233,37.318107,-120.490619
        770,Meadows Ave & Olivewood Dr. (Food Maxx),17,16:23,C1,251,37.318107,-120.490619
        771,Meadows Ave & Olivewood Dr. (Food Maxx),17,17:02,C1,269,37.318107,-120.490619
        772,Meadows Ave & Olivewood Dr. (Food Maxx),17,17:42,C1,287,37.318107,-120.490619
        773,Meadows Ave & Olivewood Dr. (Food Maxx),17,18:21,C1,305,37.318107,-120.490619
        774,Meadows Ave & Olivewood Dr. (Food Maxx),17,19:01,C1,323,37.318107,-120.490619
        775,Meadows Ave & Olivewood Dr. (Food Maxx),17,20:00,C1,341,37.318107,-120.490619
        776,Meadows Ave & Olivewood Dr. (Food Maxx),17,20:40,C1,359,37.318107,-120.490619
        777,Meadows Ave & Olivewood Dr. (Food Maxx),17,21:19,C1,377,37.318107,-120.490619
        778,Meadows Ave & Olivewood Dr. (Food Maxx),17,21:59,C1,395,37.318107,-120.490619
        779,Meadows Ave & Olivewood Dr. (Food Maxx),17,23:13,C1,413,37.318107,-120.490619
        780,Meadows Ave & Olivewood Dr. (Food Maxx),17,12:00,C1,431,37.318107,-120.490619
        781,Meadows Ave & Olivewood Dr. (Food Maxx),17,0:32,C1,449,37.318107,-120.490619
        782,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,6:51,C1,18,37.316995,-120.499007
        783,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,7:31,C1,36,37.316995,-120.499007
        784,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,8:30,C1,54,37.316995,-120.499007
        785,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,9:10,C1,72,37.316995,-120.499007
        786,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,9:49,C1,90,37.316995,-120.499007
        787,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,10:29,C1,108,37.316995,-120.499007
        788,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,11:08,C1,126,37.316995,-120.499007
        789,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,11:48,C1,144,37.316995,-120.499007
        790,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,12:47,C1,162,37.316995,-120.499007
        791,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,13:27,C1,180,37.316995,-120.499007
        792,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,14:06,C1,198,37.316995,-120.499007
        793,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,14:46,C1,216,37.316995,-120.499007
        794,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,15:45,C1,234,37.316995,-120.499007
        795,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,16:25,C1,252,37.316995,-120.499007
        796,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,17:04,C1,270,37.316995,-120.499007
        797,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,17:44,C1,288,37.316995,-120.499007
        798,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,18:23,C1,306,37.316995,-120.499007
        799,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,19:03,C1,324,37.316995,-120.499007
        800,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,20:02,C1,342,37.316995,-120.499007
        801,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,20:42,C1,360,37.316995,-120.499007
        802,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,21:21,C1,378,37.316995,-120.499007
        803,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,22:01,C1,396,37.316995,-120.499007
        804,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,23:15,C1,414,37.316995,-120.499007
        805,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,12:00,C1,432,37.316995,-120.499007
        806,Walmart on Loughborough Dr. (Bus Stop after Pier 1 entrance),18,0:34,C1,450,37.316995,-120.499007
        807,R Street Village Apts.,1,5:25,C2,1,37.3353841,-120.4867372
        808,R Street Village Apts.,1,6:25,C2,12,37.3353841,-120.4867372
        809,R Street Village Apts.,1,7:45,C2,23,37.3353841,-120.4867372
        810,R Street Village Apts.,1,8:45,C2,34,37.3353841,-120.4867372
        811,R Street Village Apts.,1,9:45,C2,45,37.3353841,-120.4867372
        812,R Street Village Apts.,1,11:05,C2,56,37.3353841,-120.4867372
        813,R Street Village Apts.,1,12:05,C2,67,37.3353841,-120.4867372
        814,R Street Village Apts.,1,13:05,C2,78,37.3353841,-120.4867372
        815,R Street Village Apts.,1,14:25,C2,89,37.3353841,-120.4867372
        816,R Street Village Apts.,1,15:25,C2,100,37.3353841,-120.4867372
        817,R Street Village Apts.,1,16:25,C2,111,37.3353841,-120.4867372
        818,R Street Village Apts.,1,17:45,C2,122,37.3353841,-120.4867372
        819,R Street Village Apts.,1,18:45,C2,133,37.3353841,-120.4867372
        820,R Street Village Apts.,1,19:45,C2,144,37.3353841,-120.4867372
        821,R Street Village Apts.,1,20:45,C2,155,37.3353841,-120.4867372
        822,R Street Village Apts.,1,22:05,C2,166,37.3353841,-120.4867372
        823,R Street Village Apts.,1,23:05,C2,177,37.3353841,-120.4867372
        824,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,5:30,C2,2,37.335707,-120.490445
        825,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,6:30,C2,13,37.335707,-120.490445
        826,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,7:50,C2,24,37.335707,-120.490445
        827,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,8:50,C2,35,37.335707,-120.490445
        828,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,9:50,C2,46,37.335707,-120.490445
        829,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,11:10,C2,57,37.335707,-120.490445
        830,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,12:10,C2,68,37.335707,-120.490445
        831,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,13:10,C2,79,37.335707,-120.490445
        832,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,14:30,C2,90,37.335707,-120.490445
        833,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,15:30,C2,101,37.335707,-120.490445
        834,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,16:30,C2,112,37.335707,-120.490445
        835,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,17:50,C2,123,37.335707,-120.490445
        836,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,18:50,C2,134,37.335707,-120.490445
        837,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,19:50,C2,145,37.335707,-120.490445
        838,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,20:50,C2,156,37.335707,-120.490445
        839,Compass Pointe Apts (Bus stop on Pacific Dr. in front),2,22:10,C2,167,37.335707,-120.490445
        840,Buena Vista Dr.,3,5:38,C2,3,37.326252,-120.502633
        841,Buena Vista Dr.,3,6:38,C2,14,37.326252,-120.502633
        842,Buena Vista Dr.,3,7:58,C2,25,37.326252,-120.502633
        843,Buena Vista Dr.,3,8:58,C2,36,37.326252,-120.502633
        844,Buena Vista Dr.,3,9:58,C2,47,37.326252,-120.502633
        845,Buena Vista Dr.,3,11:18,C2,58,37.326252,-120.502633
        846,Buena Vista Dr.,3,12:18,C2,69,37.326252,-120.502633
        847,Buena Vista Dr.,3,13:18,C2,80,37.326252,-120.502633
        848,Buena Vista Dr.,3,14:38,C2,91,37.326252,-120.502633
        849,Buena Vista Dr.,3,15:38,C2,102,37.326252,-120.502633
        850,Buena Vista Dr.,3,16:38,C2,113,37.326252,-120.502633
        851,Buena Vista Dr.,3,17:58,C2,124,37.326252,-120.502633
        852,Buena Vista Dr.,3,18:58,C2,135,37.326252,-120.502633
        853,Buena Vista Dr.,3,19:58,C2,146,37.326252,-120.502633
        854,Buena Vista Dr.,3,20:58,C2,157,37.326252,-120.502633
        855,Buena Vista Dr.,3,22:18,C2,168,37.326252,-120.502633
        856,Merced Mall Target,4,5:45,C2,4,37.323303,-120.485577
        857,Merced Mall Target,4,6:45,C2,15,37.323303,-120.485577
        858,Merced Mall Target,4,8:05,C2,26,37.323303,-120.485577
        859,Merced Mall Target,4,9:05,C2,37,37.323303,-120.485577
        860,Merced Mall Target,4,10:05,C2,48,37.323303,-120.485577
        861,Merced Mall Target,4,11:25,C2,59,37.323303,-120.485577
        862,Merced Mall Target,4,12:25,C2,70,37.323303,-120.485577
        863,Merced Mall Target,4,13:25,C2,81,37.323303,-120.485577
        864,Merced Mall Target,4,14:45,C2,92,37.323303,-120.485577
        865,Merced Mall Target,4,15:45,C2,103,37.323303,-120.485577
        866,Merced Mall Target,4,16:45,C2,114,37.323303,-120.485577
        867,Merced Mall Target,4,18:05,C2,125,37.323303,-120.485577
        868,Merced Mall Target,4,19:05,C2,136,37.323303,-120.485577
        869,Merced Mall Target,4,20:05,C2,147,37.323303,-120.485577
        870,Merced Mall Target,4,21:05,C2,158,37.323303,-120.485577
        871,Merced Mall Target,4,22:25,C2,169,37.323303,-120.485577
        872,"Villages Apts. ""M"" Street",5,5:47,C2,5,37.324417,-120.478281
        873,"Villages Apts. ""M"" Street",5,6:47,C2,16,37.324417,-120.478281
        874,"Villages Apts. ""M"" Street",5,8:07,C2,27,37.324417,-120.478281
        875,"Villages Apts. ""M"" Street",5,9:07,C2,38,37.324417,-120.478281
        876,"Villages Apts. ""M"" Street",5,10:07,C2,49,37.324417,-120.478281
        877,"Villages Apts. ""M"" Street",5,11:27,C2,60,37.324417,-120.478281
        878,"Villages Apts. ""M"" Street",5,12:27,C2,71,37.324417,-120.478281
        879,"Villages Apts. ""M"" Street",5,13:27,C2,82,37.324417,-120.478281
        880,"Villages Apts. ""M"" Street",5,14:47,C2,93,37.324417,-120.478281
        881,"Villages Apts. ""M"" Street",5,15:47,C2,104,37.324417,-120.478281
        882,"Villages Apts. ""M"" Street",5,16:47,C2,115,37.324417,-120.478281
        883,"Villages Apts. ""M"" Street",5,18:07,C2,126,37.324417,-120.478281
        884,"Villages Apts. ""M"" Street",5,19:07,C2,137,37.324417,-120.478281
        885,"Villages Apts. ""M"" Street",5,20:07,C2,148,37.324417,-120.478281
        886,"Villages Apts. ""M"" Street",5,21:07,C2,159,37.324417,-120.478281
        887,"Villages Apts. ""M"" Street",5,22:27,C2,170,37.324417,-120.478281
        888,Merced College The Bus terminal,6,5:51,C2,6,37.334558,-120.477976
        889,Merced College The Bus terminal,6,6:51,C2,17,37.334558,-120.477976
        890,Merced College The Bus terminal,6,8:11,C2,28,37.334558,-120.477976
        891,Merced College The Bus terminal,6,9:11,C2,39,37.334558,-120.477976
        892,Merced College The Bus terminal,6,10:11,C2,50,37.334558,-120.477976
        893,Merced College The Bus terminal,6,11:31,C2,61,37.334558,-120.477976
        894,Merced College The Bus terminal,6,12:31,C2,72,37.334558,-120.477976
        895,Merced College The Bus terminal,6,13:31,C2,83,37.334558,-120.477976
        896,Merced College The Bus terminal,6,14:51,C2,94,37.334558,-120.477976
        897,Merced College The Bus terminal,6,15:51,C2,105,37.334558,-120.477976
        898,Merced College The Bus terminal,6,16:51,C2,116,37.334558,-120.477976
        899,Merced College The Bus terminal,6,18:11,C2,127,37.334558,-120.477976
        900,Merced College The Bus terminal,6,19:11,C2,138,37.334558,-120.477976
        901,Merced College The Bus terminal,6,20:11,C2,149,37.334558,-120.477976
        902,Merced College The Bus terminal,6,21:11,C2,160,37.334558,-120.477976
        903,Merced College The Bus terminal,6,22:31,C2,171,37.334558,-120.477976
        904,Ironstone Dr.,7,5:53,C2,7,37.342589,-120.4806
        905,Ironstone Dr.,7,6:53,C2,18,37.342589,-120.4806
        906,Ironstone Dr.,7,8:13,C2,29,37.342589,-120.4806
        907,Ironstone Dr.,7,9:13,C2,40,37.342589,-120.4806
        908,Ironstone Dr.,7,10:13,C2,51,37.342589,-120.4806
        909,Ironstone Dr.,7,11:33,C2,62,37.342589,-120.4806
        910,Ironstone Dr.,7,12:33,C2,73,37.342589,-120.4806
        911,Ironstone Dr.,7,13:33,C2,84,37.342589,-120.4806
        912,Ironstone Dr.,7,14:53,C2,95,37.342589,-120.4806
        913,Ironstone Dr.,7,15:53,C2,106,37.342589,-120.4806
        914,Ironstone Dr.,7,16:53,C2,117,37.342589,-120.4806
        915,Ironstone Dr.,7,18:13,C2,128,37.342589,-120.4806
        916,Ironstone Dr.,7,19:13,C2,139,37.342589,-120.4806
        917,Ironstone Dr.,7,20:13,C2,150,37.342589,-120.4806
        918,Ironstone Dr.,7,21:13,C2,161,37.342589,-120.4806
        919,Ironstone Dr.,7,22:33,C2,172,37.342589,-120.4806
        920,Bellevue Ranch on Arrow Wood Dr.,8,5:57,C2,8,37.3526891,-120.4781953
        921,Bellevue Ranch on Arrow Wood Dr.,8,6:57,C2,19,37.3526891,-120.4781953
        922,Bellevue Ranch on Arrow Wood Dr.,8,8:17,C2,30,37.3526891,-120.4781953
        923,Bellevue Ranch on Arrow Wood Dr.,8,9:17,C2,41,37.3526891,-120.4781953
        924,Bellevue Ranch on Arrow Wood Dr.,8,10:17,C2,52,37.3526891,-120.4781953
        925,Bellevue Ranch on Arrow Wood Dr.,8,11:37,C2,63,37.3526891,-120.4781953
        926,Bellevue Ranch on Arrow Wood Dr.,8,12:37,C2,74,37.3526891,-120.4781953
        927,Bellevue Ranch on Arrow Wood Dr.,8,13:37,C2,85,37.3526891,-120.4781953
        928,Bellevue Ranch on Arrow Wood Dr.,8,14:57,C2,96,37.3526891,-120.4781953
        929,Bellevue Ranch on Arrow Wood Dr.,8,15:57,C2,107,37.3526891,-120.4781953
        930,Bellevue Ranch on Arrow Wood Dr.,8,16:57,C2,118,37.3526891,-120.4781953
        931,Bellevue Ranch on Arrow Wood Dr.,8,18:17,C2,129,37.3526891,-120.4781953
        932,Bellevue Ranch on Arrow Wood Dr.,8,19:17,C2,140,37.3526891,-120.4781953
        933,Bellevue Ranch on Arrow Wood Dr.,8,20:17,C2,151,37.3526891,-120.4781953
        934,Bellevue Ranch on Arrow Wood Dr.,8,21:17,C2,162,37.3526891,-120.4781953
        935,Bellevue Ranch on Arrow Wood Dr.,8,22:37,C2,173,37.3526891,-120.4781953
        936,Mammoth Lakes Rd.,9,6:04,C2,9,37.363256,-120.429404
        937,Mammoth Lakes Rd.,9,7:04,C2,20,37.363256,-120.429404
        938,Mammoth Lakes Rd.,9,8:24,C2,31,37.363256,-120.429404
        939,Mammoth Lakes Rd.,9,9:24,C2,42,37.363256,-120.429404
        940,Mammoth Lakes Rd.,9,10:24,C2,53,37.363256,-120.429404
        941,Mammoth Lakes Rd.,9,11:44,C2,64,37.363256,-120.429404
        942,Mammoth Lakes Rd.,9,12:44,C2,75,37.363256,-120.429404
        943,Mammoth Lakes Rd.,9,13:44,C2,86,37.363256,-120.429404
        944,Mammoth Lakes Rd.,9,15:04,C2,97,37.363256,-120.429404
        945,Mammoth Lakes Rd.,9,16:04,C2,108,37.363256,-120.429404
        946,Mammoth Lakes Rd.,9,17:04,C2,119,37.363256,-120.429404
        947,Mammoth Lakes Rd.,9,18:24,C2,130,37.363256,-120.429404
        948,Mammoth Lakes Rd.,9,19:24,C2,141,37.363256,-120.429404
        949,Mammoth Lakes Rd.,9,20:24,C2,152,37.363256,-120.429404
        950,Mammoth Lakes Rd.,9,21:24,C2,163,37.363256,-120.429404
        951,Mammoth Lakes Rd.,9,22:44,C2,174,37.363256,-120.429404
        952,Student Activities & Athletics Center,10,6:09,C2,10,37.3654274,-120.4262007
        953,Student Activities & Athletics Center,10,7:29,C2,21,37.3654274,-120.4262007
        954,Student Activities & Athletics Center,10,8:29,C2,32,37.3654274,-120.4262007
        955,Student Activities & Athletics Center,10,9:29,C2,43,37.3654274,-120.4262007
        956,Student Activities & Athletics Center,10,10:49,C2,54,37.3654274,-120.4262007
        957,Student Activities & Athletics Center,10,11:49,C2,65,37.3654274,-120.4262007
        958,Student Activities & Athletics Center,10,12:49,C2,76,37.3654274,-120.4262007
        959,Student Activities & Athletics Center,10,14:09,C2,87,37.3654274,-120.4262007
        960,Student Activities & Athletics Center,10,15:09,C2,98,37.3654274,-120.4262007
        961,Student Activities & Athletics Center,10,16:09,C2,109,37.3654274,-120.4262007
        962,Student Activities & Athletics Center,10,17:29,C2,120,37.3654274,-120.4262007
        963,Student Activities & Athletics Center,10,18:29,C2,131,37.3654274,-120.4262007
        964,Student Activities & Athletics Center,10,19:29,C2,142,37.3654274,-120.4262007
        965,Student Activities & Athletics Center,10,20:29,C2,153,37.3654274,-120.4262007
        966,Student Activities & Athletics Center,10,21:49,C2,164,37.3654274,-120.4262007
        967,Student Activities & Athletics Center,10,22:49,C2,175,37.3654274,-120.4262007
        968,Emigrant Pass at Scholars Lane,11,6:11,C2,11,37.3637409,-120.4305694
        969,Emigrant Pass at Scholars Lane,11,7:31,C2,22,37.3637409,-120.4305694
        970,Emigrant Pass at Scholars Lane,11,8:31,C2,33,37.3637409,-120.4305694
        971,Emigrant Pass at Scholars Lane,11,9:31,C2,44,37.3637409,-120.4305694
        972,Emigrant Pass at Scholars Lane,11,10:51,C2,55,37.3637409,-120.4305694
        973,Emigrant Pass at Scholars Lane,11,11:51,C2,66,37.3637409,-120.4305694
        974,Emigrant Pass at Scholars Lane,11,12:51,C2,77,37.3637409,-120.4305694
        975,Emigrant Pass at Scholars Lane,11,14:11,C2,88,37.3637409,-120.4305694
        976,Emigrant Pass at Scholars Lane,11,15:11,C2,99,37.3637409,-120.4305694
        977,Emigrant Pass at Scholars Lane,11,16:11,C2,110,37.3637409,-120.4305694
        978,Emigrant Pass at Scholars Lane,11,17:31,C2,121,37.3637409,-120.4305694
        979,Emigrant Pass at Scholars Lane,11,18:31,C2,132,37.3637409,-120.4305694
        980,Emigrant Pass at Scholars Lane,11,19:31,C2,143,37.3637409,-120.4305694
        981,Emigrant Pass at Scholars Lane,11,20:31,C2,154,37.3637409,-120.4305694
        982,Emigrant Pass at Scholars Lane,11,21:51,C2,165,37.3637409,-120.4305694
        983,Emigrant Pass at Scholars Lane,11,22:51,C2,176,37.3637409,-120.4305694)*/


        val intent: Intent = intent
        val loggedIn: Boolean? = intent.extras?.getBoolean("LoggedIn")
        val userEmail: String? = intent.extras?.getString("UserName")

        Log.i(userEmail + ", THING: ", loggedIn.toString())

        if (userEmail != null && loggedIn != null && loggedIn)
        {
            Log.i(userEmail + ", THING: ", loggedIn.toString())
            Toast.makeText(this, "Hello $userEmail. You are now logged in.", Toast.LENGTH_LONG).show()
        }

        //Switch to closest stop page
        val btnClosestStop = findViewById<Button>(R.id.btn_closest_stop);
        btnClosestStop.setOnClickListener()
        {
            val intent = Intent(this, ClosestStop::class.java)
            startActivity(intent)
        }

        //Switch to log in page
        val btnFavorites = findViewById<Button>(R.id.btn_favorites);
        btnFavorites.setOnClickListener()
        {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        //Switch to itinerary page
        val btnItinerary = findViewById<Button>(R.id.btn_itinerary_search);
        btnItinerary.setOnClickListener()
        {
            val intent = Intent(this, Itinerary::class.java)
            startActivity(intent)
        }

        //Switch to timetables page
        val btnTimetables = findViewById<Button>(R.id.btn_timetables);
        btnTimetables.setOnClickListener()
        {
            val intent = Intent(this, Timetables::class.java)
            startActivity(intent)
        }
    }
}

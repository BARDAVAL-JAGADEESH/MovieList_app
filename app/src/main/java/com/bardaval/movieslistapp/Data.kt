package com.bardaval.movieslistapp

import androidx.annotation.DrawableRes

object Data {

    data class Demo(
        @DrawableRes val img: Int,
        val name: String,
        val descrip: String,
        val directorname: String,
        val cast: String,
        val releaseDate: String
    )


    val horizontalDataList = listOf(
        Demo(
            R.drawable.sita_ramam,
            name = "Sita Ramam",
            descrip = " Drama .",
            directorname = "Hanu Raghavapudi",
            cast = "Dulquer Salmaan, Mrunal Thakur, Rashmika Mandanna, Sumanth",
            releaseDate = "2024-05-01"
        ),
        Demo(
            R.drawable.ay2,
            name = "Mystery in the Dark",
            descrip = "A thrilling mystery film.",
            directorname = "Krinma Kumar",
            cast = "Harish , Rashmi",
            releaseDate = "2024-06-15"
        ),
        Demo(
            R.drawable.kg2,
            name = "KGF ",
            descrip = " Chapter 1 is an action-packed film that\n follows Rocky's rise from poverty to power as he battles a ruthless kingpin in the Kolar Gold Fields.",
            directorname = "Prashanth Neel",
            cast = "Emma Watson, Daniel Radcliffe",
            releaseDate = "2024-07-22"
        ),
        Demo(
            R.drawable.ps,
            name = "PS 2",
            descrip = "An epic adventure movie.",
            directorname = "Mani Ratnam",
            cast = "stars Vikram, Aishwarya Rai Bachchan, Jayam Ravi, Karthi, Trish",
            releaseDate = "April 28, 2023"
        ),
        Demo(
            R.drawable.imasrtshanker,
            name = "iSmart Shankar",
            descrip = "The film follows Shankar, a street-smart hitman who gets \n a chip implanted in his brain, leading to chaotic and action-packed events.",
            directorname = " Puri Jagannadh",
            cast = "Ram Pothineni, Nidhhi Agerwal, Nabha Natesh, Satyadev Kancharana",
            releaseDate = " July 18, 2019"
        ),
        Demo(
            R.drawable.arjunreddy,
            name = "Arjun Reddy",
            descrip = "The film revolves around a brilliant but troubled surgeon whose\n self-destructive tendencies escalate after a failed relationship.",
            directorname = "Sandeep Reddy Vanga",
            cast = "Vijay Deverakonda, Shalini Pandey, Rahul Ramakrishna, Jia Sharma",
            releaseDate = "August 25, 2017"
        ),
        Demo(
            R.drawable.mirai,
            name = "Mirai",
            descrip = "The film is about a young boy who, after feeling neglected by his family \nfollowing the birth of his baby sister, discovers a magical garden that \n allows him to travel through time and meet relatives from different eras.",
            directorname = "Mamoru Hosoda",
            cast = "Moka Kamishiraishi, Haru Kuroki, Gen Hoshino, Kumiko ",
            releaseDate = "July 20, 2018"
        ),
        Demo(
            R.drawable.pirumani,
            name = "Mystery in the Dark",
            descrip = "A thrilling mystery film.",
            directorname = "suman",
            cast = "surya shanker,shreya",
            releaseDate = "2024-06-15"
        ),
        Demo(
            R.drawable.luckybhaskar,
            name = "Lucky Bhaskar",
            descrip = "The film is a comedy-drama about Bhaskar",
            directorname = " Sumanth Raj",
            cast = "Bhaskar, Mounika Reddy, Ravi Babu, Venu Madhav",
            releaseDate = "December 27, 2019"
        ),

        Demo(
            R.drawable.toofan,
            name = "Toofan",
            descrip = "The film follows a former boxer",
            directorname = "akeysh Omprakash Mehra",
            cast = " Farhan Akhtar, Mrunal Thakur, Paresh Rawal, Shibani Dandekar",
            releaseDate = "July 16, 202"
        ),

        Demo(
            R.drawable.hindimovie1,
            name = "The Great Adventure",
            descrip = "An epic adventure movie.",
            directorname = "Krihna das",
            cast = "Kiran, vaishu",
            releaseDate = "2024-05-01"
        ),
        Demo(
            R.drawable.badsha,
            name = "Badshah",
            descrip = "he film follows a wealthy and influential man who leads a double life, trying to bring justice and restore his family's\n honor amidst personal and political turmoil..",
            directorname = " Sreenu Vaitla",
            cast = " N. T. Rama Rao Jr., Kajal Aggarwal, Nabha Natesh, Jayaprakash Reddy",
            releaseDate = "May 5, 2013"
        ),
        Demo(
            R.drawable.imasrtshanker,
            name = "iSmart Shankar",
            descrip = "The film follows Shankar, a street-smart hitman.",
            directorname = " Puri Jagannadh",
            cast = "Ram Pothineni, Nidhhi Agerwal, Nabha Natesh, Satyadev Kancharana",
            releaseDate = " July 18, 2019"
        ),
        Demo(
            R.drawable.arjunreddy,
            name = "Arjun Reddy",
            descrip = "The film revolves around a brilliant ",
            directorname = "Sandeep Reddy Vanga",
            cast = "Vijay Deverakonda, Shalini Pandey, Rahul Ramakrishna, Jia Sharma",
            releaseDate = "August 25, 2017"
        ),
        Demo(
            R.drawable.bhale,
            name = "Bhale Bhale Magadivoy",
            descrip = "comedy film.",
            directorname = " Maruthi Dasari",
            cast = "Nani, Niveda Thomas, Yogi Babu, Murali Sharma",
            releaseDate = "September 4, 2015"
        ),


        Demo(
            R.drawable.hindimovie1,
            name = "Romantic Escapade",
            descrip = "A heartwarming romantic movie.",
            directorname = "Hari",
            cast = "Emma Watson, Daniel Radcliffe",
            releaseDate = "2024-07-22"
        ),
        Demo(
            R.drawable.sita_ramam,
            name = "Sita Ramam",
            descrip = " Drama .",
            directorname = "Hanu Raghavapudi",
            cast = "Dulquer Salmaan, Mrunal Thakur, Rashmika Mandanna, Sumanth",
            releaseDate = "2024-05-01"
        ),
        Demo(
            R.drawable.badsha,
            name = "Badshah",
            descrip = "he film follows a wealthy ..",
            directorname = " Sreenu Vaitla",
            cast = " N. T. Rama Rao Jr., Kajal Aggarwal, Nabha Natesh, Jayaprakash Reddy",
            releaseDate = "May 5, 2013"
        ),

        Demo(
            R.drawable.hindimovie1,
            name = "Romantic Escapade",
            descrip = "A heartwarming romantic movie.",
            directorname= "Somesh",
            cast = "Kiran , Raksha",
            releaseDate = "2024-07-22"
        )

    )















    val verticalDataList = listOf(
        Demo(
            R.drawable.krinamma,
            name = "Krishnamma",
            descrip = "The film is a drama centered on the life of a devoted.",
            directorname = " G. K. Reddy",
            cast = " R. Muthuraman, Nagesh, A. V. M. Rajan, Lakshmi",
            releaseDate = " April 12, 1970"
        ),
        Demo(
            R.drawable.kg2,
            name = "KGF ",
            descrip = " Chapter 1 is an action-packed film .",
            directorname = "Prashanth Neel",
            cast = "Emma Watson, Daniel Radcliffe",
            releaseDate = "2024-07-22"
        ),
        Demo(
            R.drawable.mirai,
            name = "Mirai",
            descrip = "The film is about a young boy who, after feeling neglected by his family",
            directorname = "Mamoru Hosoda",
            cast = "Moka Kamishiraishi, Haru Kuroki, Gen Hoshino, Kumiko ",
            releaseDate = "July 20, 2018"
        ),
        Demo(
            R.drawable.familystar,
            name = "Family Star",
            descrip = "A mind-bending science fiction film.",
            directorname = "Hari Shanker",
            cast = "Vijay Deverakonda,Mrunal Thakur",
            releaseDate = "2024-08-10"
        ),
        Demo(
            R.drawable.devil
            ,
            name = "Devil",
            descrip = "The film is a period drama.",
            directorname = " Naveen Medaram",
            cast = "Cast: Kalyan",
            releaseDate = "2024-09-05"
        ),

        Demo(
            R.drawable.bholashanker,
            name = "Bholaa Shankar",
            descrip = "The film is an action-packed drama",
            directorname= "Meher Ramesh",
            cast = "Chiranjeevi, Tamannaah Bhatia, Keerthy Suresh, Sushanth",
            releaseDate ="August 11, 2023"
        ),

        Demo(
            R.drawable.martin,
            name = " Martin",
            descrip = "The film is an action-packed thriller .",
            directorname= "A. P. Arjun",
            cast = " Dhruva Sarja, Vaibhavi Shandilya, Anveshi Jain",
            releaseDate = "2024-10-01"
        ),
        Demo(
            R.drawable.mrbachan,
            name = " Mr. Bachchan",
            descrip = "The film is an action-comedy ",
            directorname = "Shashank",
            cast = "Ravi Teja",
            releaseDate = "2024-08-10"
        ),
        Demo(
            R.drawable.ps,
            name = " Ponniyin Selvan: Part II",
            descrip = "A gripping historical drama.",
            directorname = "Mani Ratnam",
            cast = "Vikram, Aishwarya Rai Bachchan, Jayam Ravi, Karthi, Trisha, Aishwarya Lekshmi",
            releaseDate = " April 28, 2023"
        ),
        Demo(
            R.drawable.swayambhu,
            name = "Swayambhu",
            descrip = "An adrenaline-pumping action movie.",
            directorname = "Bharat Krishnamachari",
            cast = "Nikhil Siddhartha",
            releaseDate = "2024-10-01"
        )
        ,
        Demo(
            R.drawable.arjunreddy,
            name = "Arjun Reddy",
            descrip = "The film revolves around a brilliant ",
            directorname = "Sandeep Reddy Vanga",
            cast = "Vijay Deverakonda, Shalini Pandey, Rahul Ramakrishna, Jia Sharma",
            releaseDate = "August 25, 2017"
        ),
        Demo(
            R.drawable.adipurush,
            name = "Adipurush",
            descrip = "The film is a mythological epic based on the Hindu epic Ramayana",
            directorname = "Om Raut",
            cast = " Prabhas, Kriti Sanon, Saif Ali Khan, Sunny Singh",
            releaseDate = "June 16, 2023"
        ),
        Demo(
            R.drawable.krinamma,
            name = "Krishnamma",
            descrip = "The film is a drama centered on the life of a devoted.",
            directorname = " G. K. Reddy",
            cast = " R. Muthuraman, Nagesh, A. V. M. Rajan, Lakshmi",
            releaseDate = " April 12, 1970"
        ),

    Demo(
    R.drawable.nkr,
    name = "NKR",
    descrip = " The film is a drama featuring a prominent actor in a pivotal role.",
        directorname = " Raghava Lawrence",
    cast =" Nandamuri Kalyan Ram",
    releaseDate = "2024-08-10"
    ),
    Demo(
    R.drawable.bhale,
    name = "Historical Drama",
    descrip = "A gripping historical drama.",
        directorname = "kiarn",
    cast = "Chris Evans, Natalie Portman",
    releaseDate = "2024-09-05"
    ),
    Demo(
    R.drawable.toofan,
    name = "Action Packed",
    descrip = "An adrenaline-pumping action movie.",
        directorname= "Shanker",
    cast = "Jason Statham, Dwayne Johnson",
    releaseDate = "2024-10-01"
    ),
    Demo(
    R.drawable.familystar,
    name = "Sci-Fi Extravaganza",
    descrip = "A mind-bending science fiction film.",
        directorname = "Vijay devara",
    cast = "Viajay devarakonda, Mrunal",
    releaseDate = "2024-08-10"
    ),
        Demo(
            R.drawable.kg2,
            name = "KGF ",
            descrip = " Chapter 1 is an action-packed film .",
            directorname = "Prashanth Neel",
            cast = "Emma Watson, Daniel Radcliffe",
            releaseDate = "2024-07-22"),
    Demo(
    R.drawable.magadeera,
    name = "Magadheera",
    descrip = "The film is a historical-action epic that tells the story of a warrior",
        directorname = "S. S. Rajamouli",
    cast = "Ram Charan, Kajal Aggarwal, Srihari, Dev Gill",
    releaseDate = "July 31, 2009"
    ),
    Demo(
    R.drawable.devil,
    name = "Sci-Fi Extravaganza",
    descrip = "A mind-bending science fiction film.",
        directorname = "Hari",
    cast = "Tom Hiddleston, Scarlett Johansson",
    releaseDate = "2024-08-10"
    ),
    Demo(
    R.drawable.sarileru,
    name = "Historical Drama",
    descrip = "A gripping historical drama.",
        directorname = "harikrishna",
    cast = "Chris Evans, Natalie Portman",
    releaseDate = "2024-09-05"
    ),
    Demo(
    R.drawable.mirai,
    name = "Action Packed",
    descrip = "An adrenaline-pumping action movie.",
        directorname = "Bardaval",
    cast = "Kiran, sita",
    releaseDate = "2024-10-01"
    ),
    Demo(
    R.drawable.adipurush,
    name = "Sci-Fi Extravaganza",
    descrip = "A mind-bending science fiction film.",
        directorname = "Ram",
    cast = "Tomi, Laksmi",
    releaseDate = "2024-08-10"
    ),
    Demo(
    R.drawable.devil2,
    name = "Historical Drama",
    descrip = "A gripping historical drama.",
        directorname= "Mohan",
    cast = "Chris Evans, Natalie Portman",
    releaseDate = "2024-09-05"
    ),
        Demo(
            R.drawable.krinamma,
            name = "Krishnamma",
            descrip = "The film is a drama centered on the life of a devoted.",
            directorname = " G. K. Reddy",
            cast = " R. Muthuraman, Nagesh, A. V. M. Rajan, Lakshmi",
            releaseDate = " April 12, 1970"
        ),
        Demo(
            R.drawable.kg2,
            name = "KGF ",
            descrip = " Chapter 1 is an action-packed film .",
            directorname = "Prashanth Neel",
            cast = "Emma Watson, Daniel Radcliffe",
            releaseDate = "2024-07-22"
        ),
        Demo(
            R.drawable.mirai,
            name = "Mirai",
            descrip = "The film is about a young boy who, after feeling neglected by his family",
            directorname = "Mamoru Hosoda",
            cast = "Moka Kamishiraishi, Haru Kuroki, Gen Hoshino, Kumiko ",
            releaseDate = "July 20, 2018"
        ),
        Demo(
            R.drawable.familystar,
            name = "Family Star",
            descrip = "A mind-bending science fiction film.",
            directorname = "Hari Shanker",
            cast = "Vijay Deverakonda,Mrunal Thakur",
            releaseDate = "2024-08-10"
        ),
        Demo(
            R.drawable.devil
            ,
            name = "Devil",
            descrip = "The film is a period drama.",
            directorname = " Naveen Medaram",
            cast = "Cast: Kalyan",
            releaseDate = "2024-09-05"
        ),
        Demo(
            R.drawable.mirai,
            name = "Mirai",
            descrip = "The film is about a young boy who, after feeling neglected by his family",
            directorname = "Mamoru Hosoda",
            cast = "Moka Kamishiraishi, Haru Kuroki, Gen Hoshino, Kumiko ",
            releaseDate = "July 20, 2018"
        ),
        Demo(
            R.drawable.bholashanker,
            name = "Bholaa Shankar",
            descrip = "The film is an action-packed drama",
            directorname= "Meher Ramesh",
            cast = "Chiranjeevi, Tamannaah Bhatia, Keerthy Suresh, Sushanth",
            releaseDate ="August 11, 2023"
        ),

        Demo(
            R.drawable.martin,
            name = " Martin",
            descrip = "The film is an action-packed thriller .",
            directorname= "A. P. Arjun",
            cast = " Dhruva Sarja, Vaibhavi Shandilya, Anveshi Jain",
            releaseDate = "2024-10-01"
        ),
        Demo(
            R.drawable.mrbachan,
            name = " Mr. Bachchan",
            descrip = "The film is an action-comedy ",
            directorname = "Shashank",
            cast = "Ravi Teja",
            releaseDate = "2024-08-10"
        ),
        Demo(
            R.drawable.ps,
            name = " Ponniyin Selvan: Part II",
            descrip = "A gripping historical drama.",
            directorname = "Mani Ratnam",
            cast = "Vikram, Aishwarya Rai Bachchan, Jayam Ravi, Karthi, Trisha, Aishwarya Lekshmi",
            releaseDate = " April 28, 2023"
        ),
        Demo(
            R.drawable.swayambhu,
            name = "Swayambhu",
            descrip = "An adrenaline-pumping action movie.",
            directorname = "Bharat Krishnamachari",
            cast = "Nikhil Siddhartha",
            releaseDate = "2024-10-01"
        )
        ,
        Demo(
            R.drawable.arjunreddy,
            name = "Arjun Reddy",
            descrip = "The film revolves around a brilliant ",
            directorname = "Sandeep Reddy Vanga",
            cast = "Vijay Deverakonda, Shalini Pandey, Rahul Ramakrishna, Jia Sharma",
            releaseDate = "August 25, 2017"
        ),
        Demo(
            R.drawable.adipurush,
            name = "Adipurush",
            descrip = "The film is a mythological epic based on the Hindu epic Ramayana",
            directorname = "Om Raut",
            cast = " Prabhas, Kriti Sanon, Saif Ali Khan, Sunny Singh",
            releaseDate = "June 16, 2023"
        ),
        Demo(
            R.drawable.krinamma,
            name = "Krishnamma",
            descrip = "The film is a drama centered on the life of a devoted.",
            directorname = " G. K. Reddy",
            cast = " R. Muthuraman, Nagesh, A. V. M. Rajan, Lakshmi",
            releaseDate = " April 12, 1970"
        ),

        Demo(
            R.drawable.nkr,
            name = "NKR",
            descrip = " The film is a drama featuring a prominent actor in a pivotal role.",
            directorname = " Raghava Lawrence",
            cast =" Nandamuri Kalyan Ram",
            releaseDate = "2024-08-10"
        ),
        Demo(
            R.drawable.bhale,
            name = "Historical Drama",
            descrip = "A gripping historical drama.",
            directorname = "Hari",
            cast = "Kiran, Nain",
            releaseDate = "2024-09-05"
        ),
        Demo(
            R.drawable.toofan,
            name = "Action Packed",
            descrip = "An adrenaline-pumping action movie.",
            directorname= "Hari",
            cast = "Jawar,  John",
            releaseDate = "2024-10-01"
        ),
        Demo(
            R.drawable.familystar,
            name = "Sci-Fi Extravaganza",
            descrip = "A mind-bending science fiction film.",
            directorname = "Ram ",
            cast = "Harin, Sowmya",
            releaseDate = "2024-08-10"
        ),
        Demo(
            R.drawable.kg2,
            name = "KGF ",
            descrip = " Chapter 1 is an action-packed film .",
            directorname = "Prashanth Neel",
            cast = "Emma Watson, Daniel Radcliffe",
            releaseDate = "2024-07-22"),
        Demo(
            R.drawable.magadeera,
            name = "Magadheera",
            descrip = "The film is a historical-action epic that tells the story of a warrior",
            directorname = "S. S. Rajamouli",
            cast = "Ram Charan, Kajal Aggarwal, Srihari, Dev Gill",
            releaseDate = "July 31, 2009"
        ),
        Demo(
            R.drawable.devil,
            name = "Sci-Fi Extravaganza",
            descrip = "A mind-bending science fiction film.",
            directorname = "Hari Shanker",
            cast = "Tom Hiddleston, Scarlett Johansson",
            releaseDate = "2024-08-10"
        ),
        Demo(
            R.drawable.sarileru,
            name = "Historical Drama",
            descrip = "A gripping historical drama.",
            directorname = "Krishna ",
            cast = "Chris Evans, Natalie Portman",
            releaseDate = "2024-09-05"
        ),
        Demo(
            R.drawable.mirai,
            name = "Action Packed",
            descrip = "An adrenaline-pumping action movie.",
            directorname = "Hari Shanker",
            cast = "Jason Statham, Dwayne Johnson",
            releaseDate = "2024-10-01"
        ),
        Demo(
            R.drawable.adipurush,
            name = "Sci-Fi Extravaganza",
            descrip = "A mind-bending science fiction film.",
            directorname = "Suman",
            cast = "Tom Hiddleston, Scarlett Johansson",
            releaseDate = "2024-08-10"
        ),
        Demo(
            R.drawable.devil2,
            name = "Historical Drama",
            descrip = "A gripping historical drama.",
            directorname= "SS Raja mouli",
            cast = "Chris Evans, Natalie Portman",
            releaseDate = "2024-09-05"
        ),
    )
}

object Data2 {
    data class Demo2(
        @DrawableRes val img: Int,
        val name: String
    )

    val verticalScroll2 = listOf(
        Demo2(name = "Telugu", img = R.drawable.sarileru),
        Demo2(name = "Hindi", img = R.drawable.badsha),
        Demo2(name = "English",img = R.drawable.badsha),
        Demo2(name = "Marathi",img = R.drawable.badsha),
        Demo2(name = "Bengali",img = R.drawable.badsha),
        Demo2(name = "Kannada",img = R.drawable.badsha),
        Demo2(name = "Tamil",img = R.drawable.badsha),
        Demo2(name = "Malayali",img = R.drawable.badsha),
        Demo2(name = "Bhojpuri",img = R.drawable.badsha),
        // Add more entries as needed
    )
}


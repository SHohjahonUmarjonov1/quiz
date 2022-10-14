package com.mohirdev.quiz.tests

import com.example.quiz.R
import com.mohirdev.quiz.model.QuizModel
import com.mohirdev.quiz.model.SubjectsModel

fun tests(): List<SubjectsModel> {
    return listOf(
        SubjectsModel(
            "IT",
            listOf(
                QuizModel(
                    "C++ da konsolga chiqarish buyrug'i qanday ? ",
                    R.drawable.logo,
                    "cout",
                    "print",
                    "println",
                    "cin",
                    "A"
                ),
                QuizModel(
                    "Quyidagilardan qaysi biri arifmetik operator hisoblanadi ? ",
                    R.drawable.it1,
                    "=",
                    "+=",
                    "/=",
                    "+",
                    "D"
                ),
                QuizModel(
                    "C++ da kiritish buyrug'i qanday ? ",
                    R.drawable.logo,
                    "cout",
                    "print",
                    "println",
                    "cin",
                    "D"
                ),
                QuizModel(
                    "Quyidagilardan qaysi biri o'zlashtirish operatori emas ? ",
                    R.drawable.it1,
                    "=",
                    "+=",
                    "/=",
                    "+",
                    "D"
                ),
                QuizModel(
                    "Quyidagilardan qaysi biri o'zlashtirish operatori hisoblanadi ? ",
                    R.drawable.it2,
                    "=",
                    "+",
                    "/",
                    "-",
                    "A"
                ),
                QuizModel(
                    "C++ da pastki satrga o'tish buyrug'i qanday ? ",
                    R.drawable.it1,
                    "endl",
                    "cout",
                    "\"\\t\"",
                    "cin",
                    "A"
                ),
                QuizModel(
                    "Quyidagilardan qaysi biri arifmetik operator emas ? ",
                    R.drawable.desktop,
                    "=",
                    "+",
                    "/",
                    "-",
                    "A"
                ),
                QuizModel(
                    "Quyidagi operatorlarning qaysi biridan sonning qoldig'ini aniqlashda foydalaniladi ? ",
                    R.drawable.desktop,
                    "=",
                    "%",
                    "/",
                    "+",
                    "B"
                ),
                QuizModel(
                    "Quyidagi operatorlarning qaysi biridan sonning butun qismini aniqlashda foydalaniladi ? ",
                    R.drawable.it2,
                    "=",
                    "%",
                    "/",
                    "+",
                    "C"
                ),
                QuizModel(
                    "C++ da qaysi matematik funksiya kasr sonni o'zidan katta bo'lgan eng yaqin butun songa o'tkazib beradi ? ",
                    R.drawable.it_department1,
                    "round",
                    "floor",
                    "ceil",
                    "abs",
                    "C"
                ),
                QuizModel(
                    "C++ da qaysi matematik funksiya kasr sonni o'zidan kichik bo'lgan eng yaqin butun songa o'tkazib beradi ? ",
                    R.drawable.it1,
                    "round",
                    "floor",
                    "ceil",
                    "abs",
                    "B"
                ),
                QuizModel(
                    "C++ da qaysi matematik funksiyadan sonlarni yaxlitlashda foydalaniladi ? ",
                    R.drawable.cross_platform,
                    "round",
                    "floor",
                    "ceil",
                    "abs",
                    "A"
                ),
                QuizModel(
                    "C++ da qaysi matematik funksiya sonning ildiz qiymatini hisoblaydi ? ",
                    R.drawable.it1,
                    "round",
                    "pow",
                    "sqrt",
                    "abs",
                    "C"
                ),
                QuizModel(
                    "C++ da qaysi matematik funksiya sonning absalut qiymatini hisoblaydi ? ",
                    R.drawable.android2,
                    "round",
                    "pow",
                    "sqrt",
                    "abs",
                    "D"
                ),
                QuizModel(
                    "C++ da qaysi matematik funksiya sonning darajasini hisoblaydi ? ",
                    R.drawable.android,
                    "round",
                    "pow",
                    "sqrt",
                    "abs",
                    "B"
                ),
                QuizModel(
                    "C++ da qaysi matematik funksiya a sonning natural logorifmini hisoblaydi ? ",
                    R.drawable.android,
                    "log(a)",
                    "log10(a)",
                    "log(10,a)",
                    "abs(a)",
                    "A"
                ),
            )
        ),
        SubjectsModel(
            "Matematika",
            listOf(
                QuizModel(
                    "Quyidagilardan qaysi biri 3 ga bo'linmaydi ? ",
                    R.drawable.math3,
                    "89",
                    "987",
                    "126",
                    "45",
                    "A"
                ),
                QuizModel(
                    "Faqat o'ziga va birga bo'linadigan sonlar ... deyiladi ",
                    R.drawable.math6,
                    "Tub sonlar",
                    "Juft sonlar",
                    "Murakkab sonlar",
                    "Toq sonlar",
                    "A"
                ),
                QuizModel(
                    "146 soni quyidagilardan qaysi biriga qoldiqsiz bo'linadi ? ",
                    R.drawable.math3,
                    "3",
                    "6",
                    "4",
                    "2",
                    "D"
                ),
                QuizModel(
                    "10035 soni quyidagilardan qaysi biriga qoldiqsiz bo'linadi ? ",
                    R.drawable.math3,
                    "2",
                    "6",
                    "9",
                    "4",
                    "C"
                ),
                QuizModel(
                    "y=x+5 funksiyaning x=7 bo'lgandagi qiymatini toping  ",
                    R.drawable.math5,
                    "32",
                    "35",
                    "12",
                    "2",
                    "C"
                ),
                QuizModel(
                    "Agar kasrning qiymati birdan kichik bo'lsa bunday kasrlar ... deyiladi. ",
                    R.drawable.math6,
                    "Noto'g'ri kasr",
                    "To'g'ri kasr",
                    "O'nlik kasr",
                    "Davriy kasr",
                    "B"
                ),
                QuizModel(
                    "Agar kasrning qiymati birdan katta bo'lsa bunday kasrlar ... deyiladi. ",
                    R.drawable.math6,
                    "Noto'g'ri kasr",
                    "To'g'ri kasr",
                    "O'nlik kasr",
                    "Davriy kasr",
                    "A"
                ),
                QuizModel(
                    "Agar kasrning qiymati birga teng bo'lsa bunday kasrlar ... deyiladi. ",
                    R.drawable.math6,
                    "Noto'g'ri kasr",
                    "To'g'ri kasr",
                    "O'nlik kasr",
                    "Davriy kasr",
                    "A"
                ),
                QuizModel(
                    "Agar geometrik progressoyaning 1-hadi 6 ga va maxraji 3 ga teng bo'lsa uning 3-hadini toping.  ",
                    R.drawable.math6,
                    "56",
                    "54",
                    "12",
                    "9",
                    "B"
                ),
                QuizModel(
                    "Agar geometrik progressoyaning 3-hadi 27 ga va maxraji 3 ga teng bo'lsa uning 1-hadini toping.  ",
                    R.drawable.math6,
                    "3",
                    "6",
                    "12",
                    "9",
                    "A"
                ),
                QuizModel(
                    "Agar geometrik progressoyaning 1-hadi 2 ga va 4-hadi 16 ga teng bo'lsa uning maxrajini toping .  ",
                    R.drawable.math6,
                    "3",
                    "8",
                    "4",
                    "2",
                    "D"
                ),
                QuizModel(
                    "Agar arifmetik progressoyaning 1-hadi 6 ga va ayirmasi 3 ga teng bo'lsa uning 3-hadini toping.  ",
                    R.drawable.math6,
                    "56",
                    "54",
                    "12",
                    "9",
                    "C"
                ),
                QuizModel(
                    "Agar arifmetik progressoyaning 3-hadi 16 ga va ayirmasi 3 ga teng bo'lsa uning 1-hadini toping.  ",
                    R.drawable.math6,
                    "11",
                    "10",
                    "12",
                    "9",
                    "B"
                ),
                QuizModel(
                    "Juft funksiyaning grafigi qaysi o'qqa nisbatan simmetrik bo'ladi ? ",
                    R.drawable.math6,
                    "OX",
                    "x=1",
                    "(0;0)",
                    "OY",
                    "D"
                ),
                QuizModel(
                    "Toq funksiyaning grafigi qaysi o'qqa nisbatan simmetrik bo'ladi ? ",
                    R.drawable.math6,
                    "OX",
                    "x=1",
                    "(0;0)",
                    "OY",
                    "C"
                ),
                QuizModel(
                    "Qanday funksiyalar teskarilanuvchi bo'ladi ? ",
                    R.drawable.math1,
                    "Toq funksiyalar",
                    "Juft funksiyalar",
                    "Monoton funksiyalar",
                    "Har qanday funksiya",
                    "C"
                ),
                QuizModel(
                    "O'suvchi yoki kamayuvchi funksiyalar ... funksiyalar deyiladi. ",
                    R.drawable.math1,
                    "Toq",
                    "Juft",
                    "Monoton",
                    "Davriy",
                    "C"
                ),
                QuizModel(
                    "y=kx+l va y=ax+b funksiyalar berilgan qanday shart bajarilganda ular o'zaro perpendikulyar bo'ladi? ",
                    R.drawable.math5,
                    "k=a",
                    "ka=-1",
                    "k=-a",
                    "k=a, l=b",
                    "B"
                ),
                QuizModel(
                    "y=kx+l va y=ax+b funksiyalar berilgan qanday shart bajarilganda ular o'zaro parallel bo'ladi? ",
                    R.drawable.math1,
                    "k=a, l!=b",
                    "ka=-1",
                    "k=-a",
                    "k=a, l=b",
                    "A"
                ),
                QuizModel(
                    "y=kx+l va y=ax+b funksiyalar berilgan qanday shart bajarilganda ular ustma-ust tushadi ? ",
                    R.drawable.math1,
                    "k=a, l=b",
                    "ka=-1",
                    "k=-a",
                    "k=a, l!=b",
                    "A"
                ),
                QuizModel(
                    "Agar to'g'ri burchakli uchburchakning katetlari 3 va 4 ga teng bo'lsa uning gipotenuzasini toping. ",
                    R.drawable.math2,
                    "7",
                    "5",
                    "12",
                    "10",
                    "B"
                ),
                QuizModel(
                    "Agar to'g'ri burchakli uchburchakning katetlari 12 va 16 ga teng bo'lsa uning gipotenuzasini toping. ",
                    R.drawable.math2,
                    "20",
                    "28",
                    "18",
                    "30",
                    "A"
                ),
                QuizModel(
                    "Agar to'g'ri burchakli uchburchakning katetlari 3 va 4 ga teng bo'lsa uning yuzini toping. ",
                    R.drawable.math2,
                    "7",
                    "5",
                    "12",
                    "6",
                    "D"
                ),
                QuizModel(
                    "Agar uchburchakning tomoni 6 ga va shu tomonga tushirilgan balandligi 4 ga teng bo'lsa uning yuzini toping. ",
                    R.drawable.math2,
                    "24",
                    "20",
                    "12",
                    "10",
                    "C"
                ),
                QuizModel(
                    "Agar uchburchakning tomoni 12 ga va shu tomonga tushirilgan balandligi 5 ga teng bo'lsa uning yuzini toping. ",
                    R.drawable.math2,
                    "60",
                    "30",
                    "34",
                    "17",
                    "B"
                ),
                QuizModel(
                    "Agar uchburchakning tomoni 6 ga va yuzi 12 ga teng bo'lsa uning shu tomonga tushirilgan balandligini toping. ",
                    R.drawable.math2,
                    "6",
                    "4",
                    "8",
                    "3",
                    "B"
                ),
            )
        ),
        SubjectsModel(
            "Fizika",
            listOf(
                QuizModel(
                    "Massasi m=6kg bo'lgan jismning og'irligini toping.( g=10 deb oling ) ",
                    R.drawable.fizik1,
                    "6 N",
                    "60 N",
                    "16 N",
                    "600 N",
                    "B"
                ),
                QuizModel(
                    "Massasi m=16kg bo'lgan jismning og'irligini toping.( g=10 deb oling ) ",
                    R.drawable.fizik2,
                    "16 N",
                    "60 N",
                    "160 N",
                    "600 N",
                    "C"
                ),
                QuizModel(
                    "Quyidagilardan qaysi biri skalyar kattalik ? ",
                    R.drawable.fizik1,
                    "Ko'chish",
                    "Tezlik",
                    "Og'irlik",
                    "Yo'l",
                    "D"
                ),
                QuizModel(
                    "Quyidagilardan qaysi biri vektor kattalik ? ",
                    R.drawable.fizik1,
                    "Massa",
                    "Tezlik",
                    "Vaqt",
                    "Yo'l",
                    "B"
                ),
                QuizModel(
                    "Quyidagilardan qaysi biri skalyar kattalik emas ? ",
                    R.drawable.fizik1,
                    "Ko'chish",
                    "Massa",
                    "Vaqt",
                    "Yo'l",
                    "A"
                ),
                QuizModel(
                    "Quyidagilardan qaysi biri vektor kattalik emas ? ",
                    R.drawable.fizik1,
                    "Ko'chish",
                    "Tezlik",
                    "Masofa",
                    "Og'irlik",
                    "C"
                ),
                QuizModel(
                    "Quyidagilardan qaysi biri tok kuchining birligi hisoblanadi ? ",
                    R.drawable.ideas,
                    "Volt",
                    "Amper",
                    "Kandella",
                    "Kulon",
                    "B"
                ),
                QuizModel(
                    "Quyidagilardan qaysi biri kuchlanishning birligi hisoblanadi ? ",
                    R.drawable.fizik1,
                    "Volt",
                    "Amper",
                    "Kandella",
                    "Kulon",
                    "A"
                ),
                QuizModel(
                    "Quyidagilardan qaysi biri zaryad miqdorining birligi hisoblanadi ? ",
                    R.drawable.fizik3,
                    "Volt",
                    "Amper",
                    "Kandella",
                    "Kulon",
                    "D"
                ),
                QuizModel(
                    "Quyidagilardan qaysi birida tovushning tarqalish tezligi eng katta ? ",
                    R.drawable.question_mark2,
                    "Qattiq Jismda",
                    "Suvda",
                    "Havoda",
                    "Muhitda",
                    "A"
                ),
                QuizModel(
                    "Quyidagi birliklardan qaysi biri XBS ga kiritilmagan ? ",
                    R.drawable.question_mark2,
                    "m",
                    "s",
                    "kg",
                    "N",
                    "D"
                ),
                QuizModel(
                    "Quyidagi birliklardan qaysi biri XBS ga kiritilgan ? ",
                    R.drawable.question_mark2,
                    "V",
                    "A",
                    "kg",
                    "N",
                    "C"
                ),
                QuizModel(
                    "Jismning boshlang'ich tezligi 5 m/s ga, 10 sekunddan keyingi tezligi esa 25 m/s ga teng. Jismning tezlanishi qanday ? ",
                    R.drawable.fizik5,
                    "5",
                    "3",
                    "4",
                    "2",
                    "D"
                ),
                QuizModel(
                    "Jismning boshlang'ich tezligi 10 m/s ga, 5 sekunddan keyingi tezligi esa 25 m/s ga teng. Jismning tezlanishi qanday ? ",
                    R.drawable.question_mark2,
                    "5",
                    "3",
                    "4",
                    "2",
                    "B"
                ),
                QuizModel(
                    "Aylanma harakat qilayotgan jismning tezligi 10 m/s ga, aylanish radiusi esa 5 m ga teng. Jismning markazga intilma tezlanishi qancha ? ",
                    R.drawable.fizik2,
                    "20",
                    "15",
                    "10",
                    "25",
                    "A"
                ),
                QuizModel(
                    "O'tkazgichdan o'tayotgan tok kuchi 1 A ga teng. Agar o'tkazgichning qarshiligi 5 Om bo'lsa, o'tkazgich uchlaridagi kuchlanishni aniqlang. ",
                    R.drawable.fizik4,
                    "0.2",
                    "2",
                    "10",
                    "5",
                    "D"
                ),
                QuizModel(
                    "O'tkazgichning uzunligini 5 marta oshirsak uning qarshiligi qanday o'zgaradi ? ",
                    R.drawable.fizik4,
                    "5 marta ortadi",
                    "5 marta kamayadi",
                    "2 marta kamayadi",
                    "o'zgarmaydi",
                    "A"
                ),
                QuizModel(
                    "O'tkazgichning ko'ndalang kesim yuzasini 5 marta oshirsak uning qarshiligi qanday o'zgaradi ? ",
                    R.drawable.fizik4,
                    "5 marta ortadi",
                    "5 marta kamayadi",
                    "2 marta kamayadi",
                    "o'zgarmaydi",
                    "B"
                ),
                QuizModel(
                    "O'tkazgichning uzunligini 5 marta kamaytirsak uning qarshiligi qanday o'zgaradi ? ",
                    R.drawable.fizik4,
                    "5 marta ortadi",
                    "5 marta kamayadi",
                    "2 marta kamayadi",
                    "o'zgarmaydi",
                    "B"
                ),
                QuizModel(
                    "O'tkazgichning ko'ndalang kesim yuzasini 5 marta kamaytirsak uning qarshiligi qanday o'zgaradi ? ",
                    R.drawable.fizik4,
                    "5 marta ortadi",
                    "5 marta kamayadi",
                    "2 marta kamayadi",
                    "o'zgarmaydi",
                    "A"
                ),
            )
        )
    )
}
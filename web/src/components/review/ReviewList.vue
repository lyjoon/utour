<template>
    <v-main no-gutters>
        <v-container class="align-items-center">
            <v-card-title class="pl-0 pr-0"><strong class="secondary--text text--darken-1">사용자 리뷰 목록 </strong></v-card-title>
            <v-row no-gutters>
                <v-col class="col-12">
                    <v-chip-group column>
                        <v-text-field dense outlined placeholder="검색하실 리뷰 단어를 입력해주세요:)" />
                        <v-btn class="ml-4 secondary" elevation="0" outlined  dark><v-icon>mdi-search-web</v-icon>리뷰검색</v-btn>
                    </v-chip-group>
                </v-col>
            </v-row>

            <v-divider class="mx-auto" />

            <v-row>

                <v-col class="col-md-6 col-sm-12 col-12">
                    <v-card elevation="1">
                        <v-img height="270px" class="white--text align-end"
                               gradient="to bottom, rgba(0,0,0,.1), rgba(0,0,0,.5)" src="http://www.honeymoonlove.co.kr//daum_filebox/pds_exp/KakaoTalk_20200115_132838743.jpg">
                        </v-img>

                        <v-card-title>
                            <div>칸쿤♥</div>

                            <v-spacer></v-spacer>

                            <v-rating
                                    :value="3"
                                    color="amber"
                                    dense
                                    half-increments
                                    readonly
                                    size="16"></v-rating>
                        </v-card-title>

                        <v-card-text>
                            칸쿤에서의 첫 4박은 동양인이라곤 찾아볼 수 없었던 현지! 플라야델카르멘에서의 여행!

                            너무너무 좋았고, 또 그만큼 현지 분위기속에서 현지 식당도 가고, 바에도 가고 잘 즐겼던 것 같아요!

                            그리고 나머지 4박은 힐링하며 보낼수 있었던 TRS유카탄 올인클루..
                        </v-card-text>

                    </v-card>
                </v-col>

                <v-col class="col-md-6 col-sm-12 col-12">
                    <v-card elevation="1">
                        <v-img height="270px" class="white--text align-end"
                               gradient="to bottom, rgba(0,0,0,.1), rgba(0,0,0,.5)" src="https://pix10.agoda.net/hotelImages/4862270/0/1c6b57e935f7f6aa015d9478f8c5f252.jpg?s=1024x768">
                        </v-img>

                        <v-card-title>
                            <div>라스베거스</div>

                            <v-spacer></v-spacer>

                            <v-rating
                                    :value="3"
                                    color="amber"
                                    dense
                                    half-increments
                                    readonly
                                    size="16"></v-rating>
                        </v-card-title>

                        <v-card-text>
                            참 많은 영화와 드라마에 등장했던 미국의 대표적인 관광도시 라스베가스~~! 아마 라스베가스에 대한 알 수 없는 환상이나 동경을 가진 분들도 꽤 ...
                        </v-card-text>

                    </v-card>
                </v-col>


                <v-col class="col-md-6 col-sm-12 col-12">
                    <v-card elevation="1">
                        <v-img height="270px" class="white--text align-end"
                               gradient="to bottom, rgba(0,0,0,.1), rgba(0,0,0,.5)" src="https://www.lottehotel.com/content/dam/lotte-hotel/lotte/yangon/main/190628-2000-mai-LTYG.png.thumb.1920.1920.jpg">
                        </v-img>

                        <v-card-title>
                            <div>양곤</div>

                            <v-spacer></v-spacer>

                            <v-rating
                                    :value="3"
                                    color="amber"
                                    dense
                                    half-increments
                                    readonly
                                    size="16"></v-rating>
                        </v-card-title>

                        <v-card-text>
                            미얀마 여행을 마치고 와서 하루에 최소 한개씩이라도 여행기 혹은 리뷰를 올리려고 했는데 떨어지지 않는 감기로 골골거리느라 한참이 늦어지고 ...
                        </v-card-text>

                    </v-card>
                </v-col>


                <v-col class="col-md-6 col-sm-12 col-12">
                    <v-card elevation="1">
                        <v-img height="270px" class="white--text align-end"
                               gradient="to bottom, rgba(0,0,0,.1), rgba(0,0,0,.5)" src="https://www.smcultureandcontents.com/ko/images/travel/hotel_img01.jpg">
                        </v-img>

                        <v-card-title>
                            <div>칸쿤♥</div>

                            <v-spacer></v-spacer>

                            <v-rating
                                    :value="3"
                                    color="amber"
                                    dense
                                    half-increments
                                    readonly
                                    size="16"></v-rating>
                        </v-card-title>

                        <v-card-text>
                            칸쿤에서의 첫 4박은 동양인이라곤 찾아볼 수 없었던 현지! 플라야델카르멘에서의 여행!

                            너무너무 좋았고, 또 그만큼 현지 분위기속에서 현지 식당도 가고, 바에도 가고 잘 즐겼던 것 같아요!

                            그리고 나머지 4박은 힐링하며 보낼수 있었던 TRS유카탄 올인클루..
                        </v-card-text>

                    </v-card>
                </v-col>


                <v-col class="col-md-6 col-sm-12 col-12">
                    <v-card elevation="1">
                        <v-img height="270px" class="white--text align-end"
                               gradient="to bottom, rgba(0,0,0,.1), rgba(0,0,0,.5)" src="https://www.benikea.com/ezstock/1083/hotel/1083_main_800_1.jpg">
                        </v-img>

                        <v-card-title>
                            <div>그냥 호텔</div>

                            <v-spacer></v-spacer>

                            <v-rating
                                    :value="3"
                                    color="amber"
                                    dense
                                    half-increments
                                    readonly
                                    size="16"></v-rating>
                        </v-card-title>

                        <v-card-text>
                            ㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇ<br />
                            ㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇ
                        </v-card-text>

                    </v-card>
                </v-col>


                <v-col class="col-md-6 col-sm-12 col-12">
                    <v-card elevation="1">
                        <v-img height="270px" class="white--text align-end"
                               gradient="to bottom, rgba(0,0,0,.1), rgba(0,0,0,.5)" src="https://content.r9cdn.net/rimg/dimg/ff/d2/794e703d-city-35982-1620c5d9650.jpg?width=900&height=360&xhint=2242&yhint=1445&crop=true">
                        </v-img>

                        <v-card-title>
                            <div>서울</div>

                            <v-spacer></v-spacer>

                            <v-rating
                                    :value="3"
                                    color="amber"
                                    dense
                                    half-increments
                                    readonly
                                    size="16"></v-rating>
                        </v-card-title>

                        <v-card-text>
                            칸쿤에서의 첫 4박은 동양인이라곤 찾아볼 수 없었던 현지! 플라야델카르멘에서의 여행!

                            너무너무 좋았고, 또 그만큼 현지 분위기속에서 현지 식당도 가고, 바에도 가고 잘 즐겼던 것 같아요!

                            그리고 나머지 4박은 힐링하며 보낼수 있었던 TRS유카탄 올인클루..
                        </v-card-text>

                    </v-card>
                </v-col>

            </v-row>


            <v-row>
                <v-col class="col-12" align="center">
                    <v-card-actions class="justify-center" >
                        <v-btn rounded large color="secondary" light class="mb-8 pl-6 pr-6"> <v-icon class="mx-auto mr-2">mdi-format-list-bulleted</v-icon> 리뷰 더 보기</v-btn>
                    </v-card-actions>
                </v-col>
            </v-row>

        </v-container>
    </v-main>
</template>

<script>

    export default {
        name: "ReviewList"
    }
</script>

<style scoped>

</style>

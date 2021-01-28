<template>
    <v-footer color="#343a42" dark absolute inset app>
        <v-container>
            <v-card tile elevation="0" color="transparent">
                <v-card-title class="justify-space-between">
                    <strong>U-TOUR COMPANY</strong>
                    <div>
                      <v-chip class="yellow darken-2 black--text mr-1">여행약관</v-chip>
                      <v-chip class="yellow darken-2 black--text mr-1">보증보험</v-chip>
                      <v-chip class="grey darken-2" >개인정보방침</v-chip>
                    </div>
                </v-card-title>

                <v-card-text>
                    ADDRESS : 서울 강남구 삼성동 지하벙커<br />
                    CHIEF : kei.leeswim <br />
                    TEL : +82(02)-1599-8888 <br />
                    EMAIL : help@u-tour.com
                </v-card-text>
            </v-card>
        </v-container>
        
    </v-footer>
</template>

<script>
export default {
    name: "AppFooter"
}
</script>

<style scoped>

</style>

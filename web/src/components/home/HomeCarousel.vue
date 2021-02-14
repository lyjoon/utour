<template>
    <div>
        <v-row no-gutters align="start" justify="center">
            <!-- main-carousel -->
            <v-col class="col-md-12 fill-height" style="height: 50vh">
                <!--<v-skeleton-loader v-if="!loading" type="image, image,image,image" max-width="100%" max-height="100%"></v-skeleton-loader>-->
                <v-carousel v-model="model" height="100%" hide-delimiter-background>
                    <v-carousel-item
                            v-for="(item,i) in items"
                            :key="i"
                            :src="item.src">
                        <div align="center" style="padding-top: 30vh">
                            <h4 class="display-3"> #Slide {{ i + 1 }}</h4>
                            <v-btn class="mt-4" to="/product/555" outlined color="white" rounded large>SEE MORE</v-btn>
                        </div>
                    </v-carousel-item>
                </v-carousel>
            </v-col>
        </v-row>
        <!--
        <v-card tile elevation="2" class="secondary" align="center">
            <v-card-title class="justify-center">
                <span class="white&#45;&#45;text">ㅁㄴㅇㅁㄴ</span>
            </v-card-title>
        </v-card>-->
    </div>
</template>

<script>
    export default {
        name: "HomeCarousel",
        data () {
            return {
                drawer: false,
                model:null,
                items: [
                    {
                        src: 'https://cdn.vuetifyjs.com/images/carousel/squirrel.jpg',
                    },
                    {
                        src: 'https://cdn.vuetifyjs.com/images/carousel/sky.jpg',
                    },
                    {
                        src: 'https://cdn.vuetifyjs.com/images/carousel/planet.jpg',
                    },
                ],
            }
        },
    }
</script>

<style scoped>

</style>

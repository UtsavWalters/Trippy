<template>
  <div class="wrapper">
   

     <parallax class="section page-header header-filter" :style="headerStyle">
      <div class="container">
        <div class="md-layout">
          <div
            class="md-layout-item md-size-50 md-small-size-70 md-xsmall-size-100"
          >
            <h1 class="title">Trips</h1>
            
            <br />
          </div>
		  </div>
        </div>
    </parallax>
 
    <div class="main main-raised">
      <div class="section profile-content">
   
        <div class="container">

          
         
          <div class="description text-center">

            <p>I'm baby tattooed you probably haven't heard of them 8-bit yuccie hexagon meditation, messenger bag lyft coloring book waistcoat snackwave four 
            loko. Flexitarian fashion axe master cleanse, hot chicken farm-to-table drinking vinegar hammock lyft polaroid. Portland coloring book chicharrones, 
            YOLO tousled chia mustache stumptown hot chicken fam raw denim cloud bread VHS. Ethical activated charcoal cloud bread street art, beard polaroid 
            butcher bushwick cornhole.</p>
            <p>
           Mlkshk semiotics put a bird on it, post-ironic +1 organic skateboard affogato succulents poke. Adaptogen selfies taxidermy migas iPhone, 
           bushwick thundercats photo booth tumblr DIY ethical. Live-edge listicle humblebrag occupy, poke hammock air plant dreamcatcher austin blue 
           bottle. Green juice locavore before they sold out, intelligentsia ugh cronut roof party readymade tousled. Truffaut tilde raw denim crucifix cronut unicorn.
</p>
<p>
Mumblecore keffiyeh pinterest, YOLO vaporware biodiesel fixie keytar semiotics iPhone scenester yuccie. Yr listicle small batch taiyaki lo-fi air plant. 
Fixie squid waistcoat, wolf gluten-free lumbersexual sustainable meditation try-hard. Slow-carb affogato narwhal green juice food truck kinfolk four loko 
man braid small batch letterpress banjo chillwave iceland tumblr.</p>

  
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>

export default {

  bodyClass: "profile-page",
 

  props: {
    header: {
      type: String,
      default: require("@/assets/img/bg3.jpg")
    },
  
  },
  computed: {
    headerStyle() {
      return {
        backgroundImage: `url(${this.header})`
      };
    }
  }
};
</script>

<style lang="scss" scoped>
.section {
  padding: 0;
}


.title{
    margin-top: 30px;
    margin-bottom: 25px;
    min-height: 32px;
    color: rgb-white !important;
}
#images {
  margin-top: 50px;
}

</style>

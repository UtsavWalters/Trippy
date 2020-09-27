<template>
  <div class="wrapper">
   

     <parallax class="section page-header header-filter" :style="headerStyle">
      <div class="container">
        <div class="md-layout">
          <div
            class="md-layout-item md-size-50 md-small-size-70 md-xsmall-size-100"
          >
            <h1 class="title">About</h1>
            
            <br />
          </div>
		  </div>
        </div>
    </parallax>
 
    <div class="main main-raised">
      <div class="section profile-content">
   
        <div class="container">
      
          <div id="images">
              <h3 align="center" class="title">Our Team</h3>
            <div class="md-layout">
              <div class="md-layout-item md-size-20 md-xsmall-size-100 ml-auto">
                 
              <img
                :src="tb"
                alt="Taylor Burrows"
                class="img-raised rounded-circle"
               />
              <h4 align="center">Taylor Burrows<br>
                  <small>Team Member</small>

              </h4>
              
              </div>

              <div class="md-layout-item md-size-20 md-xsmall-size-100 ml-auto">
               <img
                  :src="msc"
                  alt="MorningStar Cornell"
                  class="img-raised rounded-circle"
                />
                  <h4 align="center">MorningStar Cornell<br>
                  <small>Product Owner</small>
                  </h4>
              </div>
              <div class="md-layout-item md-size-20 md-xsmall-size-100 ml-auto">
              <img
                  :src="nc"
                  alt="Natalie Croy"
                  class="img-raised rounded-circle"
                />
                  <h4 align="center">Natalie Croy<br>
                  <small>Scrum Master</small></h4>
              </div>

              <div class="md-layout-item md-size-20 md-xsmall-size-100 ml-auto">
              <img
                  :src="pd"
                  alt="Russell Haworth"
                  class="img-raised rounded-circle"
                />
                  <h4 align="center">Papa Diaw<br>
                  <small>Git Master</small></h4>
              </div>


               <div class="md-layout-item md-size-20 md-xsmall-size-100 ml-auto">
              <img
                  :src="rh"
                  alt="Russell Haworth"
                  class="img-raised rounded-circle"
                />
                  <h4 align="center">Russell Haworth<br>
                  <small>Team Member</small></h4>
              </div>
              <div class="md-layout-item md-size-20 md-xsmall-size-100 ml-auto">
              <img
                  :src="ak"
                  alt="Andrew King"
                  class="img-raised rounded-circle"
                />
                  <h4 align="center">Andrew King<br>
                  <small>Test Engineer</small></h4>
              </div>

              <div class="md-layout-item md-size-20 md-xsmall-size-100 ml-auto">
               <img
                  :src="vn"
                  alt="Vincent Nguyen"
                  class="img-raised rounded-circle"
                /> 
                  <h4 align="center">Vincent Nguyen<br>
                  <small>Team Member</small></h4>
              </div>

              <div class="md-layout-item md-size-20 md-xsmall-size-100 ml-auto">
             <img
                  :src="msr"
                  alt="Muhammad Saif Ur Rehman"
                  class="img-raised rounded-circle"
                />
                  <h4 align="center">Muhammad Saif Ur Rehman<br>
                  <small>Team Member</small></h4>
              </div>

              <div class="md-layout-item md-size-20 md-xsmall-size-100 ml-auto">
              <img
                  :src="urw"
                  alt="Utsev Robby Walters"
                  class="img-raised rounded-circle"
                />
                  <h4 align="center">Utsev Robby Walters<br>
                  <small>Git Master</small></h4>
              </div>

              <div class="md-layout-item md-size-20 md-xsmall-size-100 ml-auto">
              <img
                  :src="tw"
                  alt="Tommie Walker"
                  class="img-raised rounded-circle"
                />
                  <h4 align="center">Tommie Walker<br>
                  <small>Test Engineer</small></h4>
              </div>
            </div>
          </div>
              <h3 align="center" class="title">About Our Project</h3>
          <div class="md-layout about">
         
          <p align="center">This is our Senior Capstone project for Software Design and Development at the University of Central Oklahoma.<br>
            Our site will allow a user to pick various search criteria such as cost, country, local activities, and dates of travel.  
            With these criteria the site will fetch search items from multiple APIs to suggest cool potential 
            destinations for the user.  The user will be able to save favorite trips, make comments, and share saved trips publicly.  
        
          </p>
          
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
      default: require("@/assets/img/bgabout.jpg")
    },
    img: {
      type: String,
      default: require("@/assets/img/team.jpg")
    },
     tw: {
      type: String,
      default: require("@/assets/img/team/tommie.jpg")
    },
     msc: {
      type: String,
      default: require("@/assets/img/team/mstar.png")
    },
     ak: {
      type: String,
      default: require("@/assets/img/team/andrew.jpg")
    },
     nc: {
      type: String,
      default: require("@/assets/img/team/nat.jpeg")
    },
     pd: {
      type: String,
      default: require("@/assets/img/team/papa.jpg")
    },
     urw: {
      type: String,
      default: require("@/assets/img/team/robby.jpg")
    },
     rh: {
      type: String,
      default: require("@/assets/img/team/russell.jpg")
    },
     msr: {
      type: String,
      default: require("@/assets/img/team/saif.jpg")
    },
     tb: {
      type: String,
      default: require("@/assets/img/team/taylor.jpg")
    },
     vn: {
      type: String,
      default: require("@/assets/img/team/vincent.jpg")
    }
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


title{
    margin-top: 30px;
    margin-bottom: 25px;
    min-height: 32px;
    color: rgb-white !important;
}
#images {
  margin-top: 50px;
}

.about {
  margin-bottom: 50px;
}

</style>

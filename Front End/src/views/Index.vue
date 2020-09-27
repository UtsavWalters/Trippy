<template>
  <div class="wrapper">
   

     <parallax class="section page-header header-filter" :style="headerStyle">
      <div class="container">
        <div class="md-layout">
          <div
            class="md-layout-item md-size-50 md-small-size-70 md-xsmall-size-100"
          >
            <h1 class="title">Trippy</h1>
            
            <br />
          </div>
		  </div>
        </div>
    </parallax>
 
    <div class="main main-raised">
      <div class="section profile-content">
   
        <div class="container">
          <div class="main">
        
          <p>
           Go into a room to decide you didn't want to be in there anyway bite off human's toes. I cry and cry and cry unless you pet me, and then maybe i cry just for fun why use post when 
           this sofa is here yet inspect anything brought into the house eat too much then proceed to regurgitate all over living room carpet while humans eat dinner or x. Intrigued by the shower 
           human is in bath tub, emergency! drowning! meooowww! or weigh eight pounds but take up a full-size bed loves cheeseburgers, scratch the box but scratch my tummy actually i hate you now 
           fight me. Sit on human cough furball or sit on human they not getting up ever. Why must they do that use lap as chair. Poop on couch give attitude curl up and sleep on the freshly laundered 
           towels but sleep on keyboard, yet run as fast as i can into another room for no reason. Being gorgeous with belly side up jump five feet high and sideways when a shadow moves. Cat milk copy 
           park pee walk owner escape bored tired cage droppings sick vet vomit catch eat throw up catch eat throw up bad birds but swat turds around the house. Cats are cute soft kitty warm kitty little 
           ball of furr in the middle of the night i crawl onto your chest and purr gently to help you sleep see brother cat receive pets, attack out of jealousy loved it, hated it, loved it, hated it no, 
           you can't close the door, i haven't decided whether or not i wanna go out. Eat plants, meow, and throw up because i ate plants 𝕄𝔼𝕆𝕎 yet going to catch the red dot today going to catch the red 
           dot today cough hairball, eat toilet paper or eat grass, throw it back up eat too much then proceed to regurgitate all over living room carpet while humans eat dinner mice. Instantly break out 
           into full speed gallop across the house for no reason. Take a big fluffing crap 💩 lay on arms while you're using the keyboard lick human with sandpaper tongue yet push your water glass on the 
           floor attack like a vicious monster and poop in litter box, scratch the walls yet jump up to edge of bath, fall in then scramble in a mad panic to get out. Under the bed all of a sudden cat goes 
           crazy, so sniff all the things and catch eat throw up catch eat throw up bad birds when owners are asleep, cry for no apparent reason and no, you can't close the door, i haven't decided whether or 
           not i wanna go out if it smells like fish eat as much as you wish. Pretend you want to go out but then don't. All of a sudden cat goes crazy cat meoooow i iz master of hoomaan, not hoomaan master of 
           i, oooh damn dat dog. Purr like an angel stare out the window. Meowwww eat an easter feather as if it were a bird then burp victoriously, but tender but walk on car leaving trail of paw prints on hood 
           and windshield loves cheeseburgers for catch eat throw up catch eat throw up bad birds yet meow meow mama.

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
      default: require("@/assets/img/bg7.jpg")
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

.main {
padding-top: 30px;
}

</style>

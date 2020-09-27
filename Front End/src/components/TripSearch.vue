<template>
<div id="searchbar">
	<div class="title">
		<h3>Seach for your trip</h3>
	</div>	
    <div class="md-layout">
		<div class="md-layout-item md-size-25 md-xsmall-size-100 md-small-size-50 md-medium-size-25">
          <md-field class="md-form-group">
            <md-icon>flight_takeoff</md-icon>
            <md-input
              v-model="withMIcon"
              placeholder="Departing Location"
            ></md-input>
          </md-field>
        </div>
		<div class="md-layout-item md-size-25 md-xsmall-size-100 md-small-size-50 md-medium-size-25">
          <md-field class="md-form-group">
            <md-icon>flight_land</md-icon>
            <md-input
              v-model="withMIcon"
              placeholder="Destination"
            ></md-input>
          </md-field>
        </div>
		<div class="md-layout-item md-size-25 md-xsmall-size-100 md-small-size-50 md-medium-size-25">
            <md-datepicker v-model="selectedDepartureDateLabeled">
				<label>Departure date</label>
			</md-datepicker>
        </div>
		<div class="md-layout-item md-size-25 md-xsmall-size-100 md-small-size-50 md-medium-size-25">
            <md-datepicker v-model="selectedReturnDateLabeled">
				<label>Return date</label>
			</md-datepicker>
        </div>
	</div>
	<div>
		<md-button>Search</md-button>
	</div>
</div>
</template>
<script>
export default {	
	name: "trip-search",
	data () {
    	return {
        	selectedDepartureDateLabeled: null,
        	selectedReturnDateLabeled: null
    	}
	}
};
</script>
<style></style>
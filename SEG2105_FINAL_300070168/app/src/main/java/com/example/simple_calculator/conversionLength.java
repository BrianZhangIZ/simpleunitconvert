package com.example.simple_calculator;

public class conversionLength {
    @Override
    public double convert(String beforeConvert, String afterConvert, double input) {
        double userInput = input;
        double result = 0.0d;

        String original = beforeConvert.toLowerCase();
        String newU = afterConvert.toLowerCase();

        switch(beforeConvert)
        {
            case "inches":
            {
                switch(afterConvert)
                {
                    case "inches":
                        result = userInput;
                        break;
                    case "feet":

                        result = userInput / 12.0d;
                        break;
                    case "yards":

                        result = userInput / 36.0d;
                        break;
                    case "miles":

                        result = userInput / 63360.0d;
                        break;
                    case "millimeters":

                        result = userInput * 25.4d;
                        break;
                    case "centimeters":

                        result = userInput * 2.54d;
                        break;
                    case "meters":

                        result = userInput * 0.0254d;
                        break;
                    case "kilometers":

                        result = userInput * 0.0000254d;
                        break;
                }
                break;
            }
            case "feet":
            {
                switch(afterConvert)
                {
                    case "inches":

                        result = userInput*12.0d;
                        break;
                    case "feet":
                        result = userInput;
                        break;
                    case "yards":

                        result = userInput/3.0d;
                        break;
                    case "miles":

                        result = userInput/5280.0d;
                        break;
                    case "millimeters":

                        result = userInput*304.8d;
                        break;
                    case "centimeters":

                        result = userInput*30.48d;
                        break;
                    case "meters":

                        result = userInput*0.3048d;
                        break;
                    case "kilometers":

                        result = userInput*0.0003048d;
                        break;
                }
                break;
            }
            case "yards":
            {
                switch(afterConvert) {
                    case "inches":

                        result = userInput * 36.0d;
                        break;
                    case "feet":

                        result = userInput * 3.0d;
                        break;
                    case "yards":
                        result = userInput;
                        break;
                    case "miles":

                        result = userInput / 1760.0d;
                        break;
                    case "millimeters":

                        result = userInput * 914.4d;
                        break;
                    case "centimeters":

                        result = userInput*91.44d;
                        break;
                    case "meters":
                        result = userInput*0.9144d;
                        break;
                    case "kilometers":

                        result = userInput/1093.61d;
                        break;
                }
                break;
            }
            case "miles":
            {
                switch(afterConvert)
                {
                    case "inches":

                        result = userInput*6330.0d;
                        break;
                    case "feet":

                        result = userInput*5280.0d;
                        break;
                    case "yards":

                        result = userInput*1760.0d;
                        break;
                    case "miles":
                        result = userInput;
                        break;
                    case "millimeters":

                        result = userInput*1609340.0d;
                        break;
                    case "centimeters":

                        result = userInput*160934.0d;
                        break;
                    case "meters":

                        result = userInput*1609.34d;
                        break;
                    case "kilometers":

                        result = userInput*1.60934d;
                        break;
                }
                break;
            }
            case "millimeters":
            {
                switch(afterConvert)
                {
                    case "inches":
                        result = userInput*25.4d;
                        break;
                    case "feet":
                        result = userInput/304.8d;
                        break;
                    case "yards":
                        result = userInput/914.4d;
                        break;
                    case "miles":
                        result = userInput/1609000.0d;
                        break;
                    case "millimeters":
                        result =
                        break;
                    case "centimeters":
                        result =
                        break;
                    case "meters":
                        result =
                        break;
                    case "kilometers":
                        result =
                        break;
                }
                break;
            }

            case "centimeters":
            {
                switch(afterConvert)
                {
                    case "inches":
                        result = userInput / 2.54d;
                        break;
                    case "feet":
                        result = userInput / 30.48d;
                        break;
                    case "yards":
                        result = userInput / 91.44d;
                        break;
                    case "miles":
                        result = userInput/160934.0d;
                        break;
                    case "millimeters":
                        result =
                        break;
                    case "centimeters":
                        result =
                        break;
                    case "meters":
                        result =
                        break;
                    case "kilometers":
                        result =
                        break;
                }
                break;
            }
            case "meters":
            {
                switch(afterConvert) {
                    case "inches":
                        result = userInput * 39.3701d;
                        break;
                    case "feet":
                        result = userInput * 3.28084d;
                        break;
                    case "yards":
                        result = userInput*1.09361d;
                        break;
                    case "miles":
                        result = userInput/1609.34d;
                        break;
                    case "millimeters":
                        result =
                        break;
                    case "centimeters":
                        result =
                        break;
                    case "meters":
                        result =
                        break;
                    case "kilometers":
                        result =
                        break;
                }
                break;
            }
            case "kilometers":
            {
                switch(afterConvert)
                {
                    case "inches":
                        result = userInput*39370.1d;
                        break;
                    case "feet":
                        result = userInput*3280.84d;
                        break;
                    case "yards":
                        result = userInput*1093.61d;
                        break;
                    case "miles":
                        result = userInput/1.60934d;
                        break;
                    case "millimeters":
                        result =
                        break;
                    case "centimeters":
                        result =
                        break;
                    case "meters":
                        result =
                        break;
                    case "kilometers":
                        result =
                        break;
                }
                break;
            }
        }

        return result;
    }
}
